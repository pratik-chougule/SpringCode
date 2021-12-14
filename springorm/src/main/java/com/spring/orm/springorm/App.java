package com.spring.orm.springorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.hibernate.annotations.FilterDefs;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.springorm.dao.FriendDao;
import com.spring.orm.springorm.entities.Friend;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		FriendDao friendDao = context.getBean("friendDao", FriendDao.class);

		/*
		 * Friend friend = new Friend(223,"Samir patil","Sangali"); int r =
		 * friendDao.insert(friend); System.out.println("done " + r);
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		boolean go = true;
		while (go) {

			System.out.println("Press 1 for add new frined");
			System.out.println("Press 2 for display all friends");
			System.out.println("Press 3 for get details of single frined");
			System.out.println("Press 4 for delete friends");
			System.out.println("Press 5 for update Friend");
			System.out.println("Press 6 for exit");
			try {

				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
					// add a new friend
					// Taking input from useer
					System.out.println("Enter user id : ");
					int uId= Integer.parseInt(br.readLine());
					
					System.out.println("Enter user name : ");
					String uName = br.readLine();
					
					System.out.println("Enter user city : ");
					String uCity= br.readLine();
					
					//creating friend object  and setting values
					Friend f = new Friend();
					f.setFriendId(uId);
					f.setFname(uName);
					f.setfCity(uCity);
					
					// saving friend object to database by calling insert of friendDao
					int r = friendDao.insert(f);
					System.out.println(r + " friend added");
					System.out.println("-------------=======================------------");
					
					
					break;

				case 2:
					// display friends
					List<Friend> allFriends = friendDao.getAllFriends();
					
					for(Friend fs: allFriends) {
						
						System.out.println("==========================");
						System.out.println(" Id  : "+fs.getFriendId());
						System.out.println("Name : "+fs.getFname());
						System.out.println("City : "+fs.getfCity());
						System.out.println("====================================");
					}
					
					
					
					
					break;

				case 3:
					// get single data
					
					System.out.println("Enter user id : ");
					int userId = Integer.parseInt(br.readLine());
					Friend friend = friendDao.getFriend(userId);
					
					System.out.println("Id : "+friend.getFriendId());
					System.out.println("Name :"+friend.getFname());
					System.out.println("City : "+friend.getfCity());
					break;

				case 4:
					// delete friend
					
					System.out.println("Enter user id : ");
					int id = Integer.parseInt(br.readLine());
					friendDao.delete(id);
					System.out.println("Student deleted...");
					break;

				case 5:
					// update friend
					System.out.println("Enter user id : ");
					int fid = Integer.parseInt(br.readLine());
					System.out.println("Enter user name : ");
					String fName = br.readLine();
					
					System.out.println("Enter user city : ");
					String fCity= br.readLine();
					
					Friend f1 = new Friend();
					f1.setFriendId(fid);
					f1.setFname(fName);
					f1.setfCity(fCity);
					
					friendDao.updateFriend(f1);
					System.out.println(f1+" friend updated..");

					break;

				case 6:
					// exit
					go=false;
					
					break;

				}
			} catch (Exception e) {

				System.out.println("Invalid input try with another one ");
				System.out.println(e.getMessage());

			}
		}
		
		System.out.println("Thank you for using my application ");
		System.out.println("See you soon");
	}
}
