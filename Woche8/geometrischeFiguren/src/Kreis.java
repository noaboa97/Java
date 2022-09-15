public class Kreis extends Figur{
    private double radius;

    public Kreis(String farbe, double radius) {
        super(farbe);
        this.radius = radius;
    }

    public double getFlaeche() {
        return this.radius * this.radius * Math.PI;
    }
}
