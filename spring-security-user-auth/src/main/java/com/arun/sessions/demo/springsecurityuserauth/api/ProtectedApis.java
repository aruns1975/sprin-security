package com.arun.sessions.demo.springsecurityuserauth.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/protected")
public class ProtectedApis {
	@RequestMapping("greet")
	public String greet(){
		return "Good Mornin Jay";
	}
}
