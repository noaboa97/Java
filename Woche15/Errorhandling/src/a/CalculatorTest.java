package a;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator c = new Calculator(10,0);
		try{
			double result = c.div();
			System.out.println("Resultat: " + result);
		}catch (ArithmeticException e){
			System.out.println("Teilen durch 0 nicht möglich");
		}


	}

}
