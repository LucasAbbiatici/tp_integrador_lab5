package frgp.utn.edu.ar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PaginaController {

	@RequestMapping("/redireccionar_index.html")
	public ModelAndView eventoRedireccionarIndex() {
		ModelAndView MV = new ModelAndView();
		MV.setViewName("index");
		return MV;
	}
	
}
