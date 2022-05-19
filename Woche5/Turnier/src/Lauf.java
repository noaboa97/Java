import java.util.ArrayList;

public class Lauf {

    private ArrayList<Athlet> athleten = new ArrayList<Athlet>();


    public void addAthlet(Athlet a) {
        athleten.add(a);
    }

    public void start() {
        for(Athlet a : athleten){
            if(a != null) {
                a.run();
            }
        }
    }

    public void print() {
        for (Athlet a : athleten) {
            System.out.println("Name: " + a.getName());
            System.out.println("Zeit: " + a.getTime());
        }
    }
}