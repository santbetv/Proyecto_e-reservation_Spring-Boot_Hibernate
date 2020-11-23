/**
 * 
 */
package com.sbvdeveloper.ereservation.vista.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * Clase que permite gestionar las peticiones relacionadas con la autentificación
 * 
 * @author Santiago Betancur
 * @email santiago-betancur@hotmail.com
 * 
 *
 */
@Controller
@RequestMapping("app")
public class LoginController {
	
	@GetMapping(value = {"/login", "/"})
	public ModelAndView login() {
		
		ModelAndView mav = new ModelAndView();
		String errorMassage = "Usuario no autorizado, debe autentificarse.";
		mav.addObject("errorMsg", errorMassage);
		mav.setViewName("login");
		
		return mav;
	}
	
	@GetMapping("/home")
	public ModelAndView home() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		return mav;
	}
	
	
	
	

}
