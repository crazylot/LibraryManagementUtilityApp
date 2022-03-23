package org.NagarroProjects.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.NagarroProjects.service.UserService;

@Controller
public class SignInController {

	
	@Autowired
	private UserService userService;
    
	@RequestMapping("/SignIn")
	public ModelAndView signIn(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();

		String uId = request.getParameter("uId");
		String uPswd = request.getParameter("uPswd");

		if(!userService.validateUser(uId, uPswd)) {
			mv.setViewName("index"); //setting view of the page to index.jsp/loginPage in case authorization fails
			return mv;
		}
		mv.addObject("uId", uId);
		mv.setViewName("list-books");

		return mv;
	}
	
	@RequestMapping("/SignOut")
	public ModelAndView signOut(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("uId", null);
		mv.setViewName("index");
		return mv;
	}

}

//index.jsp ---> SignInController --> UserService.java -->UserDao --> UserDaoImp.java

