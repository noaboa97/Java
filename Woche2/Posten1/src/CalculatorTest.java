public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.setA(3);
        calc.setB(7);

        System.out.println("Summe: " + calc.sum());
        System.out.println("Mulitplikation: " + calc.mult());

    }
}
