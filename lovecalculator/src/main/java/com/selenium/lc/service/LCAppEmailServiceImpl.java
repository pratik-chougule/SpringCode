package com.selenium.lc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class LCAppEmailServiceImpl implements LCAppEmailService {

	@Autowired
	JavaMailSenderImpl javaMailSenderImpl;
	
	
	
	@Override
	public void sendEmail(String username,String userEmail, String result) {
		
		
		SimpleMailMessage newEmail = new SimpleMailMessage();
		newEmail.setTo(userEmail);
		
		
		newEmail.setSubject("love Calculator Application Result");
		newEmail.setText("Hi" +username +"The result predicted by the LCApp is "+result );
		
		
		javaMailSenderImpl.send(newEmail);
		
	}

}
