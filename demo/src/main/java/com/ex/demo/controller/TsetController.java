package com.ex.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test/*")
public class TsetController {
	
	@RequestMapping(value = "list")
	public String test() {
		return "test";
	}
}
