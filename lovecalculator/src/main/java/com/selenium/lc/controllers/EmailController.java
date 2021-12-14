package com.selenium.lc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.selenium.lc.api.EmailDTO;
import com.selenium.lc.api.UserInfoDTO;
import com.selenium.lc.service.LCAppEmailServiceImpl;

public class EmailController{
	
	@Autowired
	LCAppEmailServiceImpl lcAppEmailServiceImpl;
	
	
	@RequestMapping("/sendEmail")
	public String sendEmail(Model model) {
		
		model.addAttribute("emailDTO",new EmailDTO());
		
		return "send-email";
		
		
		
	}
	
	public String processEmail(@SessionAttribute("userInfo") UserInfoDTO userInfoDTO,@ModelAttribute("emailDTO") EmailDTO emailDTO) {
		
		
		
		lcAppEmailServiceImpl.sendEmail(userInfoDTO.getUsername(),emailDTO.getUserEmail(),"FRIEND");
		
		return "process-email";
	}
	
	
	
	
}