package com.example.exo;

public class Instrument {

	private String instrument;

	public Instrument() {
		// TODO Auto-generated constructor stub
	}

	public Instrument(String instrument) {
		super();
		this.instrument = instrument;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	@Override
	public String toString() {
		return " [instrument=" + instrument + "]";
	}

}
