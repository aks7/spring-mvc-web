package com.aks.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aks.jee.LoginService;
import com.aks.models.Flight;
import com.aks.models.FlightSearchService;

@Controller
public class LoginController {
//	LoginService lg= new LoginService();

	@Autowired
	LoginService lg;
	
	
	@Autowired
	FlightSearchService fss;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showLoginPage()
	{
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String showWelcomePage(@RequestParam String userid,@RequestParam String password,ModelMap model )
	{
		
		String name=userid;
		String pass=password;
		boolean isvalid= lg.isValidUser(name, pass);
		if(isvalid)
		{
			model.put("name", userid);
			return "flights";
		}
		else
		{
			model.put("errorMessage","Invalid credentials..try again");
			return "login";
		}
	}
	@RequestMapping(value="/flights",method=RequestMethod.POST)
	public String showFlightSearchResults(@RequestParam String source,@RequestParam String destination, ModelMap model )
	{
		List<Flight> flt1=fss.getFlights(source, destination);
		model.put("flightresult", flt1);
	return "flightresults";	
	}
}
