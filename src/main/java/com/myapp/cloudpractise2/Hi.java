package com.myapp.cloudpractise2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hi {
	
	@GetMapping(value="/hi")
	public String getHi() {
		return "be happy";
	}

}
