package com.example.w12figuren;

import java.util.ArrayList;
import java.util.List;

public class Canvas {

	private List<Figur> figuren = new ArrayList<Figur>();
	
	public void addFigur(Figur f) {
		this.figuren.add(f);
	}
	
	public void print() {
		for(Figur f : this.figuren) {
			if(f instanceof Kreis){
				System.out.println(f.getFarbe() + ", r=" + ((Kreis) f).getRadius() + ", A=" + f.getFlaeche());
			}
			else {
				System.out.println(f.getFarbe() + ", A=" + f.getFlaeche());
			}
		}
	}
}
