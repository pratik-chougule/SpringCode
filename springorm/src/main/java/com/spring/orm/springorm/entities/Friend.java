package com.spring.orm.springorm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="friends_details")
public class Friend {
	
	@Id
	@Column(name="friend_id")
	private int friendId;
	@Column(name="friend_name")
	private String fname;
	@Column(name="friend_city")
	private String fCity;
	
	
	public Friend(int friendId, String fname, String fCity) {
		super();
		this.friendId = friendId;
		this.fname = fname;
		this.fCity = fCity;
	}


	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getFriendId() {
		return friendId;
	}


	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getfCity() {
		return fCity;
	}


	public void setfCity(String fCity) {
		this.fCity = fCity;
	}

	
	
}
