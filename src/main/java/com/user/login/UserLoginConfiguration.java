package com.user.login;

import io.dropwizard.Configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Read configuration details for application startup
 */
public class UserLoginConfiguration extends Configuration {

	@JsonProperty
	private String applicationName;
}