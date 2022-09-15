public class TestAccount {

    public static void main(String[] args) {
        Account lohnkonto = new Account(0);

        System.out.println("Einzahlung: 1000.--");
        lohnkonto.deposit(1000);

        try {
            lohnkonto.withdraw(1000);
            System.out.println("Auszahlung: 1000.--");
        } catch (WithdrawException e) {
            System.out.println("Kontostand zu niedrig " + lohnkonto.getBalance());        }

        try {
            lohnkonto.withdraw(0.01);
            System.out.println("Auszahlung: 0.01");

        } catch (
                WithdrawException e) {

            System.out.println("Kontostand zu niedrig " + lohnkonto.getBalance());
        }

        System.out.println("Aktueller Kontostand: " + lohnkonto.getBalance());
    }
}
