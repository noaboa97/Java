package com.example.w12figuren;

public abstract class Figur {

	private String farbe;
	
	public Figur(String farbe) {
		this.farbe = farbe;
	}
	
	public String getFarbe() {
		return farbe;
	}
	
	public abstract double getFlaeche();

}
