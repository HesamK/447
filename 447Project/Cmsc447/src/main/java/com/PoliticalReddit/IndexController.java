package com.PoliticalReddit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("Register")
	public ModelAndView Registeration(HttpServletRequest request,HttpServletResponse response) {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("RegisterConfirmation.jsp");
		mv.addObject("email", email);
		mv.addObject("password", password);
		
		System.out.println("registered");
		return mv;
		
	}

}
