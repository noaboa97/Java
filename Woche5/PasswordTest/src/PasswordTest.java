import java.util.Scanner;

public class PasswordTest {
    public static void main(String[] args) {

        PasswordChecker Pwcheck = new PasswordChecker();

        String pw = null;

        do{
            Scanner s = new Scanner(System.in);
            System.out.println("Passwort eingeben: ");

            pw = s.nextLine();

        }
        while(Pwcheck.check(pw) != true);
    }
}
