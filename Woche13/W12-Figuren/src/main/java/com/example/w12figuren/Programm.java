package com.example.w12figuren;

import com.example.w12figuren.Canvas;
import com.example.w12figuren.Kreis;
import com.example.w12figuren.Rechteck;

public class Programm {

	public static void main(String[] args) {
		Kreis k = new Kreis("black", 10.5);
		Rechteck r = new Rechteck("red", 5.4, 3.3);
	
		Canvas c = new Canvas();
		c.addFigur(k);
		c.addFigur(r);
		
		c.print();
	}
}
