package com.Tka.Spring_API;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Myntra")
public class Myntra {
	@RequestMapping(value = "/Women",method = RequestMethod.GET)
	public String Women() {
		return "Fusion Wear for Women";
	}
	
	@RequestMapping(value = "/Men",method = RequestMethod.GET)
	public String Men() {
		return "Fusion Wear for Men";
	}
	
	@RequestMapping(value = "/Kids",method = RequestMethod.POST)
	public String Kids() {
		return"Kids Wear Online Store";
	}

	@RequestMapping(value = "/Gadgets", method=RequestMethod.PUT)
	public String Gadgets() {
		return"Electronic Gadgets on Myntra";
	}
	
	@RequestMapping(value = "/organisers", method=RequestMethod.DELETE)
	public String organisers() {
		return"Organising can be a tough task to complete.";
	}
	
	
	
}
