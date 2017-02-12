package com.user.login.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.inject.Inject;
import com.user.login.entity.User;

@Path("/user-service")
public class LoginResource {
	
	@Inject
	private UserLoginService loginService;
	
	@GET
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	public Object login(
			@QueryParam(value = "username") String username, 
			@QueryParam(value = "password") String password) {
		loginService.authenticateUser(username, password);
		return "hi " + username;
	}
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Object create(User user) {
		return loginService.createUser(user);
	}
	
	@GET
	@Path("/user")
	@Produces(MediaType.APPLICATION_JSON)
	public Object user(
			@QueryParam(value = "username") String username, 
			@QueryParam(value = "password") String password) {
		loginService.authenticateUser(username, password);
		return "hi " + username;
	}

}
