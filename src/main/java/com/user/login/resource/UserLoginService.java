package com.user.login.resource;

import java.util.ArrayList;

import com.user.login.entity.User;

public class UserLoginService {
	
	private ArrayList<User> usersAllowed = new ArrayList<User>();

	public boolean authenticateUser(String username, String password) {
		
		for(User user: usersAllowed) {
			if(user.getUsername().equals(username)){
				if((String.valueOf(user.getPassword()).equals(password))) {
					return user != null;
				}
			}
		}
		
		return false;
	}

	public Object createUser(User user) {
		
		usersAllowed.add(user);			
		return user;	
	}

}
