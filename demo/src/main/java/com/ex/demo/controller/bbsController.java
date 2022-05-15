package com.ex.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bbs/*")
public class bbsController {
	
	@RequestMapping(value = "list")
	public String list() throws Exception {
		
		return "bbs/list";
	}

}
