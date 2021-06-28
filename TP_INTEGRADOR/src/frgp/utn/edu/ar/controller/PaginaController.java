package frgp.utn.edu.ar.controller;


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
	/*
	@PostConstruct
	public void init() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		this.clienteNeg = (ClienteNegImpl) ctx.getBean("beanClienteNeg");
	}
	*/
	
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
			MV.addObject("estadoUsuario", "El usuario y/o contrase�a son incorrectos");
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
			MV.addObject("mensaje","Se pudo eliminar correctamente");
			MV.addObject("listaClientes",this.clienteNeg.readAll());
			MV.setViewName("mainBanco");
		}else {
			MV.addObject("mensaje","No se pudo eliminar correctamente");
			MV.addObject("listaClientes",this.clienteNeg.readAll());
			MV.setViewName("mainBanco"); 
		}
		return MV;
    }
	
	@RequestMapping("/redireccionarAgregarCuenta")
	public ModelAndView redireccionarAgregarCuenta() {
		ModelAndView MV = new ModelAndView();
		List<TipoCuenta> tipoCue = tipoCuentaNeg.readAll();
		MV.addObject("listaTipoCue",tipoCue);
		MV.setViewName("bancoAgregarCuenta");
		return MV;
	}
	
	@RequestMapping (value ="/agregarCuenta",method = RequestMethod.POST)
	public ModelAndView  agregarCuenta() {
		ModelAndView MV = new ModelAndView();
		return new ModelAndView("bancoAgregarCuenta");
	}
}




