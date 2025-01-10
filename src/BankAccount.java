/**
 * This is a simple class meant to represent a bank account, able to deposit,
 * withdraw and get balance. These methods are public where the field is
 * private, an example of encapsulation
 *
 * @author Jeremy D. W.
 * @version 2/22/2024
 */
class BankAccount {
    // Encapsulated data meant to represent the account balance
    private double balance;

    /**
     * Amount is added to the balance variable and is then printed out
     *
     * @param amount the amount to be added to this BankAccount
     */
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    /**
     * If amount withdrawn is less than the balance, the amount is subtracted from
     * balance and is then printed. Otherwise, "Insufficient funds" is printed
     *
     * @param amount the amount to withdraw from this BankAccount
     */
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    /**
     * This returns the balance of this BankAccount
     *
     * @return this bank account's balance
     */
    public double getBalance() {
        return balance;
    }
}
