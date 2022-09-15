package logic;

public class Raum {
    private String nummer;
    private String geschoss;
    private double grundflaeche;

    public String getNummer() {
        return nummer;
    }

    public Raum(String nummer, String geschoss, double grundflaeche) {
        this.nummer = nummer;
        this.geschoss = geschoss;
        this.grundflaeche = grundflaeche;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public String getGeschoss() {
        return geschoss;
    }

    public void setGeschoss(String geschoss) {
        this.geschoss = geschoss;
    }

    public double getGrundflaeche() {
        return grundflaeche;
    }

    public void setGrundflaeche(double grundflaeche) {
        this.grundflaeche = grundflaeche;
    }

    public void printRaumInfos() {

        System.out.println(this.nummer +": " +this.geschoss +", Fläche: "+ this.grundflaeche);

    }
}
