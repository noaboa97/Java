package logic;

public class Computerraum extends Unterrichtsraum{

    private int computerArbeitsplaetze;

    public int getComputerArbeitsplaetze() {
        return computerArbeitsplaetze;
    }

    public void setComputerArbeitsplaetze(int computerArbeitsplaetze) {
        this.computerArbeitsplaetze = computerArbeitsplaetze;
    }

    public void printComputerraumInfos(){

        System.out.println("\n");
        this.printUnterrichtraumInfos();
        System.out.println("Computer: "+ this.computerArbeitsplaetze);


    }
}
