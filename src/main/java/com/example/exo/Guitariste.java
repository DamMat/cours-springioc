package com.example.exo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Guitariste implements IMusicien {

	@Autowired
	@Qualifier("ukulele")
	private Instrument instrument;

	public Guitariste() {}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void jouer() {
		System.out.println("Le guitariste joue : " + this.instrument);
	}

}
