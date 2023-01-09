package com.example.exo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Pianiste implements IMusicien {
	
	@Autowired
	@Qualifier("synthe")
	private Instrument instrument;

	public Pianiste() {
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void jouer() {
		System.out.println("Le pianiste joue : " + this.instrument);
	}

}
