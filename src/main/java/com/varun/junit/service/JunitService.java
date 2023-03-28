package com.varun.junit.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.varun.junit.repository.JunitRepo;

public class JunitService {
	
	@Autowired
	JunitRepo junitRepo;
	
	public String saveIntoDatabase() {
		
		return junitRepo.save();
	}

}
