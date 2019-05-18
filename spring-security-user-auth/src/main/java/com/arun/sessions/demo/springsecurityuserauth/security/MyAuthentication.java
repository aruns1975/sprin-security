package com.arun.sessions.demo.springsecurityuserauth.security;

import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

public class MyAuthentication implements Authentication {
	private String user;
	private boolean authticationStatus=false;
	
	public MyAuthentication(String user) {
		// TODO Auto-generated constructor stub
		this.user = user;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getCredentials() {
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public Object getDetails() {
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public Object getPrincipal() {
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public boolean isAuthenticated() {
		// TODO Auto-generated method stub
		return authticationStatus;
	}

	@Override
	public void setAuthenticated(boolean isAuthenticated)
			throws IllegalArgumentException {
		authticationStatus = isAuthenticated;

	}

}
