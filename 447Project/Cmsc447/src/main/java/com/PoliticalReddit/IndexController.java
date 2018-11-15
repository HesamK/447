package com.PoliticalReddit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.PoliticalReddit.Entity.User;
import com.PoliticalReddit.dao.AccountDao;

@Controller
public class IndexController {

		@Autowired 
		AccountDao fdao;
	
		User user;
		
	@RequestMapping("Register")
	public ModelAndView Registeration(HttpServletRequest request,HttpServletResponse response) {
		
		String email = request.getParameter("email");
		String userName = request.getParameter("userName");
		String USstate = request.getParameter("USstate");
		String password = request.getParameter("password");
		boolean isLoggedIn = false;
		boolean isBanned = false;
		
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("RegisterConfirmation.jsp");
		mv.addObject("email", email);
		mv.addObject("password", password);
		
		user = new User(userName,email,USstate,isLoggedIn,password,isBanned);
		fdao.createUser(user);
		
		
		System.out.println("registered");
		return mv;
		
	}

}
