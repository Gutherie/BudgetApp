package com.gutherie.budgetApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("/app/hi")
	@ResponseBody
	public String hi() {
	    return "Hello, world.";
	}
}
