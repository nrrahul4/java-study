package com.javastudy.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	private static int userCount = 3;
	
	static {
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(2, "Smith", new Date()));
		users.add(new User(3, "Harry", new Date()));
	}
	
	public static List<User> findAll() {
		return users;
	}
	
	public static User saveUser(User user) {
		if(user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
	
	public static User findOne(int id) {
		for(User user: users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
		
	}
	
	public static boolean isEmptyUsers() {
		if(users.isEmpty()) {
			return true;
		}
		return false;
	}
}
