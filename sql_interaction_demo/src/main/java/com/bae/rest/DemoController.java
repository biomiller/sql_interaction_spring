package com.bae.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.entity.Citizen;
import com.bae.service.DemoService;

@RestController
@RequestMapping
public class DemoController {
	
	private DemoService demoService;
	
	@Autowired
	public DemoController(DemoService demoService) {
		this.demoService = demoService;
	}

	
	@GetMapping("/{surname}")
	public Collection<Citizen> getCitizensBySurname(@PathVariable("surname") String surname){
		return demoService.getCitizensBySurname(surname);
	}
}
