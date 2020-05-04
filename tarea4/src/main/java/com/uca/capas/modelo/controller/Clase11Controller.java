package com.uca.capas.modelo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.modelo.domain.Producto;

@Controller
public class Clase11Controller {
	
	@RequestMapping("/producto")
	public ModelAndView index11() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", new Producto());
		mav.setViewName("clases/clase11/index");
		return mav;
	}
	
	
	@RequestMapping("/procesar")
	public ModelAndView procesar(@Valid @ModelAttribute Producto proc, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) { //Hay errores, redirigimos a la pantalla del formulario
			mav.setViewName("clases/clase11/index");
		}
		else { //Si no hay, flujo normal
			mav.addObject("nombre_Proc", proc.getNombre_Proc());
			mav.setViewName("clases/clase11/resultado");
		}
		return mav;
	}

}
