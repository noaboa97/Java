package programm;

import logic.*;

public class Programm {
    public static void main(String[] args) {
        Raum r = new Raum();
        r.setGeschoss("EG");
        r.setNummer("0.2");
        r.setGrundflaeche(15.6);
        r.printRaumInfos();

        Unterrichtsraum u = new Unterrichtsraum();
        u.setGeschoss("EG");
        u.setNummer("0.2");
        u.setGrundflaeche(15.6);
        u.setSitzplätze(16);
        u.setLehrerPCvorhanden(true);
        u.setWhiteboardVorhanden(true);
        u.printUnterrichtraumInfos();

        Computerraum c = new Computerraum();
        c.setGeschoss("EG");
        c.setNummer("0.2");
        c.setGrundflaeche(15.6);
        c.setSitzplätze(16);
        c.setLehrerPCvorhanden(true);
        c.setWhiteboardVorhanden(true);
        c.setComputerArbeitsplaetze(16);
        c.printComputerraumInfos();
    }
}
