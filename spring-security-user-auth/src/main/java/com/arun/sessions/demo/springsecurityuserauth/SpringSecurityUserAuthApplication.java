package com.arun.sessions.demo.springsecurityuserauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringSecurityUserAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityUserAuthApplication.class, args);
	}

}
