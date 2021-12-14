package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	// This is one method of redirecting by using prefix redirect

	/*
	 * @RequestMapping("/one") 
	 * public String one() {
	 * 
	 * System.out.println("this  is one handler"); 
	 * return "redirect:/two"; }
	 */
	 // this is second method of redirecting by using RedirectView object
	@RequestMapping("/one") 
	  public RedirectView one() {
	  
	  System.out.println("this  is one handler"); 
	  RedirectView redirectView = new RedirectView();
	  redirectView.setUrl("two");
	  return redirectView;
	  }
	
	
	
	@RequestMapping("/two")
	public String two() {
		
		System.out.println("This is second handler");
		return "contact";
	}
}
