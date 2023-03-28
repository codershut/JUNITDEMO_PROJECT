package com.varun.junit.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.varun.junit.repository.JunitRepo;

@ExtendWith(MockitoExtension.class)  
public class ServiceTest {
	
	@InjectMocks
	JunitService junitService;
	
	@Mock
	JunitRepo junitRepo;
	
	@BeforeEach
	void setup() {
	    MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void testServiceClass() {
		when(junitRepo.save()).thenReturn("DONE");
		assertEquals("DONE",junitService.saveIntoDatabase());
	}
	@Test
	void testClass() {
		when(junitRepo.save()).thenReturn("DONE");
		assertEquals("DONE",junitService.saveIntoDatabase());
	}
	
	
}
