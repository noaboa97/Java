package com.example.w12figuren;

public class Kreis extends Figur {

	private double radius;
	
	public Kreis(String farbe, double radius) {
		super(farbe);
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	@Override
	public double getFlaeche() {
		return radius * radius * Math.PI;
	}
}
