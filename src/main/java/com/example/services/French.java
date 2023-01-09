package com.example.services;

public class French implements Language {

	@Override
	public String getHello() {
		return "Bonjour";
	}

	@Override
	public String getBye() {
		return "Au revoir";
	}

}
