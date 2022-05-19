public class Turnier {

    public static void main(String[] args) {

        Athlet a1 = new Athlet("Coleman");
        Athlet a2 = new Athlet("Test1");
        Athlet a3 = new Athlet("Test2");
        Athlet a4 = new Athlet("Test3");
        Athlet a5 = new Athlet("Test4");
        Athlet a6 = new Athlet("Test5");
        Athlet a7 = new Athlet("Test6");
        Athlet a8 = new Athlet("Test7");

        Lauf lauf = new Lauf();
        lauf.addAthlet(a1);
        lauf.addAthlet(a2);
        lauf.addAthlet(a3);
        lauf.addAthlet(a4);
        lauf.addAthlet(a5);
        lauf.addAthlet(a6);
        lauf.addAthlet(a7);
        lauf.addAthlet(a8);

        lauf.start();
        lauf.print();
    }

}