package com.microservice3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
	
	@Autowired
	private Client client;
	
	@GetMapping("/fromsecondcontroller")
	public String getMessageFromMicrosevice1(){
		return client.getData();
	}

}
