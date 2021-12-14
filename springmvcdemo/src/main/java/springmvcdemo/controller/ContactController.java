package springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvcdemo.model.User;

@Controller
public class ContactController {
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Lerning Java");
		m.addAttribute("Desc", "Home for programmer" );
		
	}
	
	@RequestMapping("/contact")
	public String showForm( Model m) {
		
		// commondata
		//m.addAttribute("Header", "Lerning Java");
		//m.addAttribute("Desc", "Home for programmer" );
		
		return "contact";
	}
	
	@RequestMapping(path="/processform", method=RequestMethod.GET)
	public String handleForm(@ModelAttribute User user, Model model)
			
			
	{
		System.out.println(user);
		
		if (user.getUserName().isBlank()) {
			
			return "redirect:/contact";
			
		}
		
		
		// Process
		// common data
		//model.addAttribute("Header", "Lerning Java");
		//model.addAttribute("Desc", "Home for programmer" );
		
		
		return "success";
	}

}

/*
@RequestMapping(path="/processform", method=RequestMethod.POST)
public String handleForm(
		
		@RequestParam("email") String userEmail,
		@RequestParam("userName") String userName,
		@RequestParam("password") String userPassword, Model model)
{
	
	System.out.println("user email " +userEmail);
	System.out.println("user name " +userName);
	System.out.println("user password "+ userPassword);
	
	
	User user = new User();
	
	user.setEmail(userEmail);
	user.setUserName(userName);
	user.setPassword(userPassword);
	
	
	System.out.println(user);
	// Process
	
	
	//model.addAttribute("name",userName);
	//model.addAttribute("email", userEmail);
	//model.addAttribute("password", userPassword);
	
	model.addAttribute("user",user);
	
	
	
	
	return "success";
	*/
