/**
 * Meant to represent a simple savings account with a method to apply interest,
 * all other methods are inherited from the BankAccount super class
 *
 * @author Jeremy D. W.
 * @version 2/22/2024
 */
class SavingsAccount extends BankAccount {
    // Encapsulated data meant to represent the account interest rate
    private double interestRate;

    /**
     * Constructs a Savings account class with parameters initalBalance and
     * interestRate
     *
     * @param initialBalance used to deposit an initial balance into the class
     * @param interestRate   the interest rate for this class, should not be less
     *                       than 0
     */
    public SavingsAccount(double initialBalance, double interestRate) {
        this.deposit(initialBalance);
        this.interestRate = interestRate;
    }

    /**
     * Applies interest to the balance inherited from the BankAccount super class by
     * multiplying balance by interestRate and depositing the result. The interest
     * is then printed
     */
    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest applied: $" + interest);
    }
}