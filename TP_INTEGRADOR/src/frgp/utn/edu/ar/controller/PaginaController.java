package frgp.utn.edu.ar.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import frgp.utn.edu.ar.entidad.Usuario;
import frgp.utn.edu.ar.negocio.UsuarioNeg;
import frgp.utn.edu.ar.resources.Config;

@Controller
public class PaginaController {
	
	@Autowired
	@Qualifier("UsuarioNeg")
	private UsuarioNeg usuarioNeg;
	@Autowired
	private Usuario usuario;

	@RequestMapping("/redireccionar_index.html")
	public ModelAndView eventoRedireccionarIndex() {
		ModelAndView MV = new ModelAndView();
		MV.setViewName("index");
		return MV;
	}
	
	@RequestMapping("/login.html")
	public ModelAndView eventoRedireccionarUsuario(String txtUsuario, String txtPassword) {
		ModelAndView MV = new ModelAndView();
		
		usuario.setUser(txtUsuario);
		usuario.setPass(txtPassword);
		
		usuario = usuarioNeg.validarUsuario(usuario);
		
		if(usuario.getId() == 0)
		{
			MV.addObject("estadoUsuario", "El usuario y/o contraseña son incorrectos");
			MV.setViewName("index");
		} else {
			MV.addObject("usuario", usuario);
			if(usuario.getAdmin() == false) {
				MV.setViewName("mainCliente");
			} else {
				MV.setViewName("mainBanco");
			}
		}
		
		return MV;
	}
	
}
