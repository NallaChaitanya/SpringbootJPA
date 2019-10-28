package com.derivative;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Test")
public class TestController {
	
	@RequestMapping("/")
	public String healthCheck() {
		return "Hai from Controller";
	}

}
