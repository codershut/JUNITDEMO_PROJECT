package com.varun.junit.repository;

import org.springframework.stereotype.Repository;

@Repository
public class JunitRepo {

	public String save() {
		
		//Some database logic to save data in db
		return "DONE";
	}

}
