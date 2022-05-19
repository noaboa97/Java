
public class Fakultaet {

	private int zahl;

	public Fakultaet(int zahl) {
		this.zahl = zahl;
	}

	public long calcFakultaet() {
		long resultat = 1; // 0! = 1

		if (zahl >= 0) { //falls sichergestellt werden soll, dass nur positive Zahlen erlaubt sind
			for (int i = 1; i <= this.zahl; i++) {
				resultat = resultat * i;
			}
		} else {
			resultat = 0;
		}

		return resultat;
	}
}
