package sendingDatafromViewToController;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import sending.model.user.User;

@Controller
public class SendingDataViewToController {
	
	@RequestMapping("/contact")
	public String showForm() {
		
		return "contact";
	}

	@RequestMapping(path="/processform", method=RequestMethod.POST )
	public String handleForm(@ModelAttribute User user)
			
	{	
		
	
		System.out.println(user);
		
		
		
		return "success";
	}
	
	
	/*
	 * @RequestMapping(path="/processform", method=RequestMethod.POST ) public
	 * String handleForm(
	 * 
	 * @RequestParam("email") String userEmail,
	 * 
	 * @RequestParam("userName") String userName,
	 * 
	 * @RequestParam("userPassword") String userPassword, Model model) {
	 * 
	 * sending.model.user.User user = new sending.model.user.User();
	 * 
	 * user.setEmail(userEmail); user.setUserName(userName);
	 * user.setUserPassword(userPassword);
	 * 
	 * 
	 * System.out.println("user email " + userEmail);
	 * System.out.println("user Name "+ userName);
	 * System.out.println("user password "+ userPassword);
	 * 
	 * 
	 * 
	 * model.addAttribute("email", userEmail); model.addAttribute("userName",
	 * userName); model.addAttribute("userPassword", userPassword);
	 * 
	 * return "success"; }
	 */
}
