package com.Tka.Spring_API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/w3School")
public class MyController {
	
	@RequestMapping(value = "/first",method = RequestMethod.GET)
	public String FirstAPI() {
		
		return "This is my First API";
	}
	
	@GetMapping("/HTMl")
	public String HTML() {
		return "HTML is the Frontend Language";
	}
	
	
	@GetMapping("/Js")
	public String Js() {
		return "javaScript is used to add logic..";
	}
	@GetMapping("/Css")
	public String Css() {
		return "Css used for Styeling";
	}
	@GetMapping("/Java")
	public String Java() {
		return "Java is the Backend Language";
	}
	@GetMapping("/Sql")
	public String Sql() {
		return "Sql is having Database Code";
	}
	
}
