package logic;

public class Unterrichtsraum extends Raum{

    private int sitzplätze;
    private boolean lehrerPCvorhanden;
    private boolean whiteboardVorhanden;

    public int getSitzplätze() {
        return sitzplätze;
    }

    public void setSitzplätze(int sitzplätze) {
        this.sitzplätze = sitzplätze;
    }

    public boolean isLehrerPCvorhanden() {
        return lehrerPCvorhanden;
    }

    public void setLehrerPCvorhanden(boolean lehrerPCvorhanden) {
        this.lehrerPCvorhanden = lehrerPCvorhanden;
    }

    public boolean isWhiteboardVorhanden() {
        return whiteboardVorhanden;
    }

    public void setWhiteboardVorhanden(boolean whiteboardVorhanden) {
        this.whiteboardVorhanden = whiteboardVorhanden;
    }

    public void printUnterrichtraumInfos() {

        System.out.println("\n");
        this.printRaumInfos();
        System.out.println("Sitzplätze: "+ this.sitzplätze);
        System.out.println("Lehrer PC: "+ this.lehrerPCvorhanden);
        System.out.println("Whiteboard: "+this.whiteboardVorhanden);


    }

}
