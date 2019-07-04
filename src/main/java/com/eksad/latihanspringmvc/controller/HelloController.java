package com.eksad.latihanspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	@ResponseBody
	public String sayhello() {
		return "Hello World";
	}

	@RequestMapping("/myName")
	@ResponseBody
	public String myName(@RequestParam String myName) {
		return "Hello " + myName;
	}

	@RequestMapping("/toGoogle")
	@ResponseBody
	public String myGoogle() {
		return "<a href='https://www.google.com'>Ini link google</a>";
	}

}
