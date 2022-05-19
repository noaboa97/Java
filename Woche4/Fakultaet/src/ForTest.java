import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		
		//Auftrag 1
		for(int i = 42; i <= 53; i++) {
			System.out.println(i);
		}
		
		//Auftrag 2
		for(int i = 3; i >= 0; i--) {
			if(i != 0) {
				System.out.println(i);
			} else {
				System.out.println("Los");
			}
		}
		
		//Auftrag 3
		Scanner sc = new Scanner(System.in);
		System.out.println("Zahl eingeben: ");
		int z = sc.nextInt();
		
		Fakultaet f = new Fakultaet(z);
		long res = f.calcFakultaet();
		System.out.println("Resultat: " + res);
	}
}
