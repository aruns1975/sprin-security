package com.arun.sessions.demo.springsecurityuserauth.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class PublicApis {
	@RequestMapping("greet")
	public String greet(){
		return "Good Mornin Divya";
	}

}
