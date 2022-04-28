public class Person {
    private String Name;
    private String Vorname;
    private String Strasse;
    private int PLZ;
    private String Ort;
    private double Gehalt;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getStrasse() {
        return Strasse;
    }

    public void setStrasse(String strasse) {
        Strasse = strasse;
    }

    public int getPLZ() {
        return PLZ;
    }

    public void setPLZ(int PLZ) {
        this.PLZ = PLZ;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    public double getGehalt() {
        return Gehalt;
    }

    public void setGehalt(double gehalt) {
        Gehalt = gehalt;
    }

    public void print() {
        System.out.println("*********************");
        System.out.println(getVorname() + getName());
        System.out.println(getStrasse());
        System.out.println(getPLZ() + " " + getOrt());
        System.out.println(getGehalt() + " CHF");

    }





}
