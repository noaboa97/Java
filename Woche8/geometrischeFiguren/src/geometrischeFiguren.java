import java.util.ArrayList;

public class geometrischeFiguren {
    public static void main(String[] args) {
        Figur K = new Kreis("blue",2);
        Figur R = new Rechteck("red", 2, 2);
        Figur D = new Dreieck("Baby blue",2,2);

        ArrayList<Figur> list = new ArrayList<Figur>();
        list.add(K);
        list.add(R);
        list.add(D);

        for(Figur f: list){
            System.out.println(f.getFlaeche());
        }
    }
}
