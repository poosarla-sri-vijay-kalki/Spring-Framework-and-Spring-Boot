package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	private int id;
	@Autowired
	private Laptop lap;
	
	public void compile() {
		lap.compile();
	}
}
