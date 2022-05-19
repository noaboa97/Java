public class Kapitalanlage {

    private double anfangskapital;
    private double zinssatz;
    private int laufzeit;

    public Kapitalanlage(double anfangskapital, double zinssatz, int laufzeit){
        this.anfangskapital = anfangskapital;
        this.zinssatz = zinssatz;
        this.laufzeit = laufzeit;
    }
    
    public double getAnfangskapital(){
        return this.anfangskapital;
    }
    
    public double getZinssatz (){
        return this.zinssatz;
    }
    
    public int getLaufzeit (){
        return this.laufzeit;
    }
    
    public String getKapitalentwicklung() {
        double zinsen = 0;
        double kapital = 0;
        String kapitalentwicklung = "";
        
        kapitalentwicklung = "Jahr\tZinsen\t\tEndkapital\n"
                           + "------------------------------------ \n";
        
        kapital = anfangskapital;
        for(int jahr=1; jahr <= laufzeit; jahr++) {
            zinsen = kapital * (zinssatz / 100);
            zinsen = Math.round(zinsen * 100) / 100.0; // Rundung 1 Rappen
            kapital = kapital + zinsen;
            kapital = Math.round(kapital * 100) / 100.0; //Rundung 1 Rappen
            kapitalentwicklung = kapitalentwicklung + jahr + "\t"
                                   + zinsen + "\t\t"
                                   + kapital + "\n";
        }
        
        return kapitalentwicklung;
    }
}