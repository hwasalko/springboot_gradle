package com.hwasalko.app.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		
		return "welcome to my page.";
		
	}
	
}
