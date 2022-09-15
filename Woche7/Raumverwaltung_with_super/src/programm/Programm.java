package programm;

import logic.*;

public class Programm {
    public static void main(String[] args) {
        Raum r = new Raum("2.3", "2. Stock", 50.3);
        Unterrichtsraum u = new Unterrichtsraum("2.3", "2. Stock", 50.3, 16, true, true);
        Computerraum c = new Computerraum("2.3", "2. Stock", 50.3, 16, true, true, 10);
        r.printRaumInfos();
        u.printUnterrichtraumInfos();
        c.printComputerraumInfos();
    }
}
