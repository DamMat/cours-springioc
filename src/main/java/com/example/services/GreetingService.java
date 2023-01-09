package com.example.services;

import javax.sound.midi.VoiceStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Injecte un bean de type service ds la factory de spring core
public class GreetingService {
	
	// Recupere un bean injecte avec Autowired ds la classe AppConfig
	@Autowired
	private Language language;

	public GreetingService() {
	}
	
	public void sayHello() {
		System.out.println("Message : " +  language.getHello());
	}

}
