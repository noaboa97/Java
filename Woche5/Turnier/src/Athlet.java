import java.util.Random;

public class Athlet {
    private String name;
    private double time;

    public Athlet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getTime() {
        return time;
    }

    public void run() {

        Random r = new Random();
        double rnd = (r.nextDouble() * 4) + 8;
        this.time = rnd;
    }





}
