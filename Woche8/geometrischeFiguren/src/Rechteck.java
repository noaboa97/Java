public class Rechteck extends Figur{

    private double hoehe;
    private double breite;

    public Rechteck(String farbe, double hoehe, double breite) {
        super(farbe);
        this.hoehe = hoehe;
        this.breite = breite;
    }

    public double getFlaeche() {
        return this.hoehe * this.breite;
    }
}
