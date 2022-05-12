public class Person {

    private String name;
    private double gewicht;

    public Person() {
    }

    public Person(String name, double gewicht) {
        this.name = name;
        this.gewicht = gewicht;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

}
