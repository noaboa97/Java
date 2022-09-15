package b;

public class Calculator {

	private int a;
	private int b;
	
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int sum() {
		return this.a + this.b;
	}
	
	public int mult() {
		return this.a * this.b;
	}
	
	public double div() {
		return this.a / this.b;
	}
}
