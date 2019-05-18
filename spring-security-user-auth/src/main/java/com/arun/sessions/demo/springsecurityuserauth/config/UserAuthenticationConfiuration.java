package com.arun.sessions.demo.springsecurityuserauth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import com.arun.sessions.demo.springsecurityuserauth.security.MyAuthentication;

@Configuration
@Order(1)
public class UserAuthenticationConfiuration extends WebSecurityConfigurerAdapter{

	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/api/public/**").permitAll()
		    .anyRequest().authenticated()
		    .and().formLogin()
		    .and()
		    .csrf().disable();
		    
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.authenticationProvider(new AuthenticationProvider() {
			
			@Override
			public boolean supports(Class<?> authentication) {
				// TODO Auto-generated method stub
				return authentication.isAssignableFrom(UsernamePasswordAuthenticationToken.class);
			}
			
			@Override
			public Authentication authenticate(Authentication authentication)
					throws AuthenticationException {
				// TODO Auto-generated method stub
				System.out.println("User name "+authentication.getName());
				System.out.println("Credentials "+authentication.getCredentials());
				MyAuthentication postAuthentication =new MyAuthentication(authentication.getName());
				postAuthentication.setAuthenticated(true);
				
				return postAuthentication;
			}
		});
	}
	
	

}
