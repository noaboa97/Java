package com.example.w12figuren;

public class Rechteck extends Figur {

	private double breite;
	private double hoehe;
	
	public Rechteck(String farbe, double breite, double hoehe) {
		super(farbe);
		this.breite = breite;
		this.hoehe = hoehe;
	}

	@Override
	public double getFlaeche() {
		return this.breite * this.hoehe;
	}

}
