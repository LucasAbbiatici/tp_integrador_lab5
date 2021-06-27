package frgp.utn.edu.ar.controller;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import frgp.utn.edu.ar.entidad.Cliente;
import frgp.utn.edu.ar.entidad.Cuenta;
import frgp.utn.edu.ar.entidad.Usuario;
import frgp.utn.edu.ar.negocioImpl.ClienteNegImpl;
import frgp.utn.edu.ar.negocioImpl.CuentaNegImpl;
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
	
	@RequestMapping("/listaCuentas.html")
	public ModelAndView eventoListarCuentas() {
		ModelAndView MV = new ModelAndView();
		
		List<Cuenta> listaCuentas = cuentaNegImpl.readAll();
		
		MV.addObject("listaCuentas",listaCuentas);
		
		MV.setViewName("bancoCuentas");
		
		return MV;
	}
}




