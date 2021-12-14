package com.selenium.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	
	@NotBlank(message = " * Your name can not be blanked")
	//@Min(value = 3,message = "* Your name should have at least 3 character")
	@Size(min = 3,max = 15,message ="* Your name should have  character between 3-15 " )
	private String username;
	private String crushname;
	@AssertTrue(message = "You have to agree to use our app")
	private boolean termAndCondition;
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCrushname() {
		return crushname;
	}
	public void setCrushname(String crushname) {
		this.crushname = crushname;
	}
	
	
	
	public boolean isTermAndCondition() {
		return termAndCondition;
	}
	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [username=" + username + ", crushname=" + crushname + ", termAndCondition="
				+ termAndCondition + "]";
	}

	
	

}
