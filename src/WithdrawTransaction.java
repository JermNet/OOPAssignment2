/**
 * This is an a simple withdraw transaction class which implements Transaction
 * so this class can withdraw money, an example of abstraction
 *
 * @author Jeremy D. W.
 * @version 2/22/2024
 */
class WithdrawTransaction implements Transaction {
    // An instance of the BankAccount class meant to represent a bank account
    private BankAccount account;

    /**
     * Constructs the WithdrawTransaction class with a BankAccount
     *
     * @param account an instance of the BankAccount class
     */
    public WithdrawTransaction(BankAccount account) {
        this.account = account;
    }

    /**
     * Implements the execute method from Transaction to withdraw money from a
     * BankAccount
     *
     * @param amount used to specify the amount to be taken out of the account
     */
    public void execute(double amount) {
        account.withdraw(amount);
    }
}