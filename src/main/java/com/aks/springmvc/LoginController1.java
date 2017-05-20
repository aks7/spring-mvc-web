package com.aks.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController1 {

	@RequestMapping(value="/login1")
	public String sayHello()
	{
		return "welcome";
	}
	@RequestMapping(value="/spring-mvc")
	public String sayHello1()
	{
		return "login";
	}
}
