package com.aks.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller @RequestMapping("/addPirate.htm")
public class TestClass {
	public static final int x=7;
//	  @RequestMapping(method = RequestMethod.GET) 
//	  public String setupForm(ModelMap model) 
//	  {
//		  return "addPirate";
//		
//	  } 
//	  @ModelAttribute("pirate") 
//	  public Pirate setupPirate() 
//	  {
//		  Pirate pirate = new Pirate();
//		  return pirate; 
//		
//	  }
//	  @RequestMapping(method = RequestMethod.POST)
//	  protected String addPirate(@ModelAttribute("pirate") Pirate pirate) 
//	  {
//		  pirateService.addPirate(pirate); return "pirateAdded";
//		
//	  }
//	  @Autowired PirateService pirateService; }
}
interface f1
{
	int x=10;
}
class a
{
	public static void fun1()
	{}
}
class b extends a
{
	 public static void fun1()
	{}
	
}