public class Dreieck extends Figur{


    private double grundlinie;
    private double hoehe;

    public Dreieck(String farbe, double grundlinie, double hoehe) {
        super(farbe);
        this.grundlinie = grundlinie;
        this.hoehe = hoehe;
    }

    public double getFlaeche() {
        return this.grundlinie * this.hoehe / 2;
    }
}
