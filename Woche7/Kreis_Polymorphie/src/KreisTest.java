
public class KreisTest {

	public static void main(String[] args) {

		Kreissektor ks = new Kreissektor(50,20);
		System.out.println("Kreis Radius " + ks.getRadius() + ", Fl�che: " + ks.getFlaeche());
		Kreis k = new Kreis(50);
		System.out.println("Kreis Radius " + k.getRadius() + ", Fl�che: " + k.getFlaeche());
		
	}
}
