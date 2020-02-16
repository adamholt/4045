package com.helloworld.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/index")
	public String index() {
		
		return "The Home Page!";
	}
	@RequestMapping("/")
	public String start() {
		
		return "start";
	}
}
