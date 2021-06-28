package frgp.utn.edu.ar.controller;


import java.sql.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import frgp.utn.edu.ar.entidad.Cliente;
import frgp.utn.edu.ar.entidad.Cuenta;
import frgp.utn.edu.ar.entidad.TipoCuenta;
import frgp.utn.edu.ar.entidad.Usuario;
import frgp.utn.edu.ar.negocioImpl.ClienteNegImpl;
import frgp.utn.edu.ar.negocioImpl.CuentaNegImpl;
import frgp.utn.edu.ar.negocioImpl.TipoCuentaNegImpl;
import frgp.utn.edu.ar.negocioImpl.UsuarioNegImpl;
import frgp.utn.edu.ar.resources.Config;


@Controller
public class PaginaController {
	
	@Autowired
	private ClienteNegImpl clienteNeg;
	@Autowired
	private UsuarioNegImpl usuarioNeg;
	@Autowired
	private Usuario usuario;
	@Autowired
	private CuentaNegImpl cuentaNegImpl;
	@Autowired
	private TipoCuentaNegImpl tipoCuentaNeg;
	@Autowired
	private Cuenta cuenta; 
	@Autowired
	private TipoCuenta tc;
	@Autowired
	private Cliente cliente;
	
	@RequestMapping("/index.html")
	public ModelAndView eventoRedireccionarIndex() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView eventoRedireccionarUsuario(String txtUsuario, String txtPassword,HttpServletRequest request) {
		ModelAndView MV = new ModelAndView();
		
		usuario.setUser(txtUsuario);
		usuario.setPass(txtPassword);
		
		usuario = usuarioNeg.validarUsuario(usuario);
		
		if(usuario.getId() == 0)
		{
			MV.addObject("estadoUsuario", "El usuario y/o contraseña son incorrectos");
			MV.setViewName("index");
		} else {
			
			request.getSession().setAttribute("usuario", usuario);
			
			MV.addObject("usuario", usuario);
			if(usuario.getAdmin() == false) {
				MV.setViewName("mainCliente");
			} else {
				List<Cliente> clientes = clienteNeg.readAll();
				MV.addObject("listaClientes",clientes);
				MV.setViewName("mainBanco");
			}
		}
		return MV;
	}
	
	@RequestMapping("/transferencias")
	public ModelAndView eventoRedireccionarTransferencias() {
		return new ModelAndView("transferenciaCliente");
	}
	
	@RequestMapping("/listaClientes")
	public ModelAndView eventoRedireccionarListarClientes() {
		ModelAndView MV = new ModelAndView();
		
		List<Cliente> clientes = clienteNeg.readAll();
		MV.addObject("listaClientes",clientes);
		MV.setViewName("mainBanco");
		
		return MV;
	}
	
	@RequestMapping("/listaCuentas")
	public ModelAndView eventoListarCuentas() {
		ModelAndView MV = new ModelAndView();
		
		List<Cuenta> listaCuentas = cuentaNegImpl.readAll();
		
		MV.addObject("listaCuentas",listaCuentas);
		
		MV.setViewName("bancoCuentas");
		
		return MV;
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView eliminarSession(HttpServletRequest request) {
		request.getSession().removeAttribute("usuario");		
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = { "/delete-user-{ssoId}" }, method = RequestMethod.GET)
    public ModelAndView deleteUser(@PathVariable int ssoId) {

		ModelAndView MV = new ModelAndView();
		if(clienteNeg.delete(ssoId)) {
			MV.addObject("mensaje","El cliente se pudo eliminar correctamente");
			MV.addObject("color", "color: green; margin-top: 20px;");
			MV.addObject("listaClientes",this.clienteNeg.readAll());
			MV.setViewName("mainBanco");
		}else {
			MV.addObject("mensaje","No se pudo eliminar correctamente el cliente");
			MV.addObject("color", "color: red; margin-top: 20px;");
			MV.addObject("listaClientes",this.clienteNeg.readAll());
			MV.setViewName("mainBanco"); 
		}
		return MV;
    }
	
	@RequestMapping(value = { "/delete-cuenta-{ssoId}" }, method = RequestMethod.GET)
    public ModelAndView deleteCuenta(@PathVariable int ssoId) {

		ModelAndView MV = new ModelAndView();
		if(cuentaNegImpl.delete(ssoId)) {
			MV.addObject("mensaje","La cuenta se pudo eliminar correctamente");
			MV.addObject("color", "color: green; margin-top: 20px;");
			MV.addObject("listaCuentas",this.cuentaNegImpl.readAll());
			MV.setViewName("bancoCuentas");
		}else {
			MV.addObject("mensaje","No se pudo eliminar correctamente la cuenta");
			MV.addObject("color", "color: red; margin-top: 20px;");
			MV.addObject("listaCuentas",this.cuentaNegImpl.readAll());
			MV.setViewName("bancoCuentas"); 
		}
		return MV;
    }
	
	@RequestMapping("/redireccionarAgregarCuenta")
	public ModelAndView redireccionarAgregarCuenta() {
		ModelAndView MV = new ModelAndView();
		
		List<TipoCuenta> tipoCue = tipoCuentaNeg.readAll();
		List<Cliente> listaClientes = clienteNeg.readAll();
		
		MV.addObject("listaTipoCue",tipoCue);
		MV.addObject("listaClientes",listaClientes);
		MV.setViewName("bancoAgregarCuenta");
		
		return MV;
	}
	
	@RequestMapping (value ="/agregarCuenta",method = RequestMethod.POST)
	public ModelAndView  agregarCuenta(String txtNombre,int selectTipoCuenta, int selectClientes) {
		ModelAndView MV = new ModelAndView();
		
		long millis = System.currentTimeMillis();  
        Date date = new Date(millis);  
		
		tc = tipoCuentaNeg.obtenerTipoCuenta(selectTipoCuenta);
		
		cliente = clienteNeg.obtenerCliente(selectClientes);
		
		cuenta.setNombre(txtNombre);
		cuenta.setCliente(cliente);
		cuenta.setTipoDeCuenta(tc);
		cuenta.setFechaCreacion(date);
		
		List<TipoCuenta> tipoCue = tipoCuentaNeg.readAll();
		List<Cliente> listaClientes = clienteNeg.readAll();
		
		if(!cuentaNegImpl.verificarCantCuentas(selectClientes)) {
			
			MV.addObject("mensaje", "El cliente seleccionado ya posee 4 cuentas");
			MV.addObject("color", "color: red; margin-top: 20px; text-align: center;");
			MV.addObject("listaTipoCue",tipoCue);
			MV.addObject("listaClientes",listaClientes);
			MV.setViewName("bancoAgregarCuenta");
			
		} else {
			
			if(cuentaNegImpl.insert(cuenta)) {
				MV.addObject("mensaje", "La cuenta fue ingresada correctamente");
				MV.addObject("color", "color: green; margin-top: 20px; text-align: center;");
				MV.addObject("listaTipoCue",tipoCue);
				MV.addObject("listaClientes",listaClientes);
				MV.setViewName("bancoAgregarCuenta");
				
			} else {
				
				MV.addObject("mensaje", "No se pudo agregar la cuenta");
				MV.addObject("color", "color: red; margin-top: 20px; text-align: center;");
				MV.addObject("listaTipoCue",tipoCue);
				MV.addObject("listaClientes",listaClientes);
				MV.setViewName("bancoAgregarCuenta");
		
			}
		}
		
		return MV;
	}
}




