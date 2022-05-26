package com.controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("/helloworld")
	 @ResponseBody
	 public String hello() {
	 return "Hello INF012!";
	}
}
