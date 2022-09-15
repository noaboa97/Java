package b;

import java.util.Scanner;

public class CalculatorConsole {

	public static void main(String[] args) {
		
		String userInputA = "34";
		String userInputB = "ABC";

		int a = 0;
		int b = 0;

		try {
			a = Integer.parseInt(userInputA);
		}catch (NumberFormatException e){
			a = 0;
			e.printStackTrace();
		}

		try {
			b = Integer.parseInt(userInputB);
		}catch (NumberFormatException e){
			b = 0;
			e.printStackTrace();
		}finally {
			Calculator c = new Calculator(a, b);
			System.out.println("Summe " + c.sum());
		}

	}
}
