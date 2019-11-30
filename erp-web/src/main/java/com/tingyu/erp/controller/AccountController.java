package com.tingyu.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/**
 * 账户管理控制器类
 * @author William
 *
 */
@Controller
public class AccountController {
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String home() {		
		return "Login";
	}
	@RequestMapping(value="/error",method=RequestMethod.GET)
	public String error() {
	
		return "Error";
	}
	@RequestMapping(value="/yong",method=RequestMethod.GET)
	public ModelAndView ll() {
		ModelAndView modelAndView = new ModelAndView();	
		modelAndView.setViewName("Error");
		return modelAndView;
	}
}
