/**
 * Class to represent an account
 *
 * @author Roger Zaugg
 * @version 1.0
 */
public class Account {

    private double balance;

    /**
     * Creates an new AccountSimple instance
     *
     * @param initialBalance initial balance of the account
     */
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    /**
     * Returns the current balance of the account
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * get some money from the account
     *
     * @param amount
     */
    public void withdraw(double amount) throws WithdrawException {

        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            throw new WithdrawException("Kontostand zu niedrig");
        }
    }

    /**
     * add money to the account
     *
     * @param amount
     */
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }
}
