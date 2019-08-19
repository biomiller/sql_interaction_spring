package com.bae.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.entity.Citizen;
import com.bae.repository.DemoRepository;

@Service
public class DemoService {

	private DemoRepository demoRepo;
	
	@Autowired
	public DemoService(DemoRepository demoRepo) {
		this.demoRepo = demoRepo;
	}
	
	public Collection<Citizen> getCitizensBySurname(String surname) {
		return demoRepo.findBysurname(surname);
	}
	
}
