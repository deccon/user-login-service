package com.user.login;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import com.user.login.resource.LoginResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class UserLoginApplication extends Application<UserLoginConfiguration> {

	public static void main(String[] args) throws Exception {
		new UserLoginApplication().run(args);
	}
	
	@Override
	public void run(UserLoginConfiguration configuration,
			Environment environment) throws Exception {
		Injector injector = createInjector(configuration);
		LoginResource loginResource = injector.getInstance(LoginResource.class);
		environment.jersey().register(loginResource);
	}
	
	/*
	 * Configure injection for guice
	 */
	private Injector createInjector(final UserLoginConfiguration conf) {
		return Guice.createInjector(new AbstractModule() {
			@Override
			protected void configure() {
				// configure injection instances
			}
		});
	}

}
