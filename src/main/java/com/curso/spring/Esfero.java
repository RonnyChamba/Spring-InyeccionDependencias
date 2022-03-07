package com.curso.spring;

public class Esfero {

	
	private Tinta tinta;
	
	public Esfero(Tinta tinta) {		
		this.tinta = tinta;
	}
	
	public Esfero() {
	}
	
	public void verColor() {
		
		tinta.color();
	}

	public void setTinta(Tinta tinta) {
		this.tinta = tinta;
	}
	
	
}
