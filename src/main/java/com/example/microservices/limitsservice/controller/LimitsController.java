package com.example.microservices.limitsservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.limitsservice.bean.Limits;
import com.example.microservices.limitsservice.configuration.ConfigurationLim;

@RestController
public class LimitsController {
	
	@Autowired
	private ConfigurationLim configuration;
	
	@GetMapping("/limits")
	public Limits retriveLimits() {
		return new Limits(configuration.getMinumum(), configuration.getMaximum());
//		return new Limits(4, 100);
	
	}
}
