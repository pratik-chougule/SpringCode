package com.spring.orm.springorm.dao;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.springorm.entities.Friend;

public class FriendDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Friend friend )
	{
		//insert
		
		Integer i =(Integer)this.hibernateTemplate.save(friend);
		return i;
	}
	
	// get the single data(object)
	
	public Friend getFriend(int friendId) {
		
		Friend friend = this.hibernateTemplate.get(Friend.class, friendId);
		
		return friend;
	}
	// get all students(all rows)
	
	public List<Friend>getAllFriends(){
		List<Friend> friends = this.hibernateTemplate.loadAll(Friend.class);
		
		return friends;
	}
	
	// deletibg data
	@Transactional
	public void delete(int friendId) {
		Friend friend = this.hibernateTemplate.get(Friend.class, friendId);
		this.hibernateTemplate.delete(friend);
	}
	
	// updating data.....
	@Transactional
	public void updateFriend(Friend friend) {
		this.hibernateTemplate.update(friend);
	}


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	

}
