import java.util.Scanner;

public class Programm {

	public static void main(String[] args) {
		double anfangskapital = 0;
		double zinssatz = 0;
		int laufzeit = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bitte geben Sie die folgenden Informationen\nzu der gewünschten Kapitalanlage ein:" + "\n");
		System.out.print("Anfangskapital (CHF): ");
		anfangskapital = scanner.nextDouble();
		System.out.print("Zinssatz (%): ");
		zinssatz = scanner.nextDouble();
		System.out.print("Laufzeit (Jahre): ");
		laufzeit = scanner.nextInt();
		System.out.println("");

		Kapitalanlage kapitalanlage = new Kapitalanlage(anfangskapital, zinssatz, laufzeit);

		System.out.println("Kapitalentwicklung");
		System.out.println("------------------");
		System.out.println(kapitalanlage.getKapitalentwicklung());
	}
}
