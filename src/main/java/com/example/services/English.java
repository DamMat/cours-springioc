package com.example.services;

public class English implements Language {

	@Override
	public String getHello() {
		return "Hello";
	}

	@Override
	public String getBye() {
		return "Bye";
	}
	
}
