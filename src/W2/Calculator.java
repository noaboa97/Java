package W2;

public class Calculator {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public long sum(){
        return this.a + this.b;
    }

    public long mult(){
        return this.a * this.b;
    }
}
