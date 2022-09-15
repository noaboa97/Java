package calculator;

public class Calculator {

    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double sum(){
        return this.a + this.b;
    }

    public double mult(){
        return this.a * this.b;
    }

    public double sub(){
        return this.a - this.b;
    }

    public double div(){
        return this.a / this.b;
    }

    public double mod(){
        return this.a % this.b;
    }
}
