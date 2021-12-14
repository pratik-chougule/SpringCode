package com.selenium.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.selenium.lc.api.CommunicationDTO;
import com.selenium.lc.api.Phone;
import com.selenium.lc.api.UserRegistrationDTO;

@Controller
public class RegistrationController {
	
	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO) {
		
		System.out.println("inside showRegistrationPage method");
		
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("45655");
		
		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);
		
		userRegistrationDTO.setCommunicationDTO(communicationDTO);
		
		return "user-registration-page";
	}
	
	
	@RequestMapping("/registration-process")
	public String  processUserReg(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO) {
		
		return "registration-success";
	}

}
