
public class Programm {

	public static void main(String[] args) {
	
		Aufzug aufzugOst = new Aufzug();
		
		Person p1 = new Person();
		p1.setName("Müller");
		p1.setGewicht(78.5);
		
		Person p2 = new Person("Meier", 65.3);
		
		Haus haus = new Haus();
		haus.setAufzug(aufzugOst);
		
		haus.rufeAufzug(p1);
		haus.rufeAufzug(p2);

		haus.status();
	}
}
