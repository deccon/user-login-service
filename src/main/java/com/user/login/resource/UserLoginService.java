package com.user.login.resource;

import java.util.ArrayList;

import com.user.login.entity.User;

public class UserLoginService {
	
	private ArrayList<User> usersAllowed = new ArrayList<User>();

	public User authenticateUser(String username, String password) {
		
		for(User user: usersAllowed) {
			if(user.getUsername().equals(username)){
				if((user.getPassword().equals(password))) {
					return user;
				}
			}
		}
		
		return null;
	}

	public Object createUser(User user) {
		
		usersAllowed.add(user);
		
		return null;
	}

}
