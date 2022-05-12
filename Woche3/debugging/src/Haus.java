
public class Haus {
	
	private Aufzug aufzug;
	
	public void setAufzug(Aufzug aufzug1) {
		this.aufzug = aufzug1;
	}
	
	public void rufeAufzug(Person p) {
		this.aufzug.zusteigen(p);
	}
	
	public void status() {
		System.out.println("Aktuelles Gewicht: " + aufzug.getAktGewicht() + "kg");
	}
}
