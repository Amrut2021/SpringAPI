package com.Tka.Spring_API;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MakeMyTrip")
public class MakeMyTrip {

	@GetMapping("/Flight")
	public String Flight() {
		return "Book International and Domestic Flights";
	}
	@PostMapping("/Hotels")
	public String Hotels() {
		return "Book Domestic Property Online.";
	}
	
	@PutMapping("Trains")
	public String Trains() {
		return "Traveling by train is a popular choice.";
	}
	@DeleteMapping("/Buses")
	public String Buses() {
		return "Booking bus tickets online is super easy and comfortable";
	}
	
	@PostMapping("/HomeStays")
	public String HomeStays() {
		return "Book your ideal Homestay - Villas, Apartments & more.";
	}
}
