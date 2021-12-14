package com.selenium.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.selenium.lc.api.UserInfoDTO;

@Controller
@SessionAttributes("userInfo")
public class LCAppController {
	
	@RequestMapping("/")
	public String showHomepage(Model model) {
		
		model.addAttribute("userInfo", new UserInfoDTO());
		
		/*
		 * Cookie[] cookies = request.getCookies();
		 * 
		 * for(Cookie temp:cookies) {
		 * 
		 * if("lcApp.username".equals(temp.getName()));{ String myUserName=
		 * temp.getValue(); userInfoDTO.setUsername(myUserName); } }
		 */
		
		
		
		
		return "home-page";
	}

	@RequestMapping("/process-homepage")
	public String showResultPage(@Valid @ModelAttribute("userInfo")UserInfoDTO userInfoDTO, BindingResult result) {
		// @Valid annotation help us to trigger the validation for the Bean
		System.out.println(userInfoDTO.isTermAndCondition());
		
		if(result.hasErrors()) {
		List<ObjectError> allErrors = result.getAllErrors();
		
		for(ObjectError temp : allErrors) {
			
			System.out.println(temp);
		}
			
			return "home-page";
		}
		
		
		
		// creating a cookies for th euser name
		
		/*
		 * Cookie theCookie = new Cookie("lcApp.username", userInfoDTO.getUsername());
		 * 
		 * theCookie.setMaxAge(60*60*24);
		 * 
		 * response.addCookie(theCookie);
		 */
		
		// write a service which will calculate the love  % between 
		
		return "result-page";
	}
}
