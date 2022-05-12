
public class Aufzug {

	private double aktGewicht;

	public double getAktGewicht() {
		return aktGewicht;
	}
	
	public void zusteigen(Person person) {
		this.aktGewicht = this.aktGewicht + person.getGewicht();
	}
}

