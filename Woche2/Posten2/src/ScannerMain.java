
import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {

        Person person = new Person();

        System.out.print("Name: ");
        Scanner scanner = new Scanner(System.in);
        person.setName(scanner.nextLine());

        System.out.print("Vorname: ");
        person.setVorname(scanner.nextLine());

        System.out.print("Strasse: ");
        person.setStrasse(scanner.nextLine());

        System.out.print("Ort: ");
        person.setOrt(scanner.nextLine());

        System.out.print("PLZ: ");
        person.setPLZ(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Gehalt: ");
        person.setGehalt(scanner.nextInt());

        person.print();


    }
}
