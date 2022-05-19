public class Lauf {

    private Athlet[] athleten = new Athlet[8];


    public void addAthlet(Athlet a) {
        for(int i = 0; i < athleten.length; i++) {
            if(athleten[i] == null) {
                athleten[i] = a;
                break;
            }
        }
    }

    public void start() {
        for (int i = 0; i < athleten.length; i++) {
            Athlet a = athleten[i];
            if(a != null) {
                a.run();
            }
        }
    }

    public void print() {
        for (int i = 0; i < athleten.length; i++) {
            System.out.println("Name: " + athleten[i].getName());
            System.out.println("Zeit: " + athleten[i].getTime());
        }
    }
}