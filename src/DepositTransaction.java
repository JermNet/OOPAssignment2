/**
 * This is an a simple deposit transaction class which implements Transaction so
 * this class can deposit money, an example of abstraction
 *
 * @author Jeremy D. W.
 * @version 2/22/2024
 */
class DepositTransaction implements Transaction {
    // An instance of the BankAccount class meant to represent a bank account
    private BankAccount account;

    /**
     * Constructs the DepostTransaction class with a BankAccount
     *
     * @param account an instance of the BankAccount class
     */
    public DepositTransaction(BankAccount account) {
        this.account = account;
    }

    /**
     * Implements the execute method from Transaction to deposit money into a
     * BankAccount
     *
     * @param amount used to specify the amount to be put into the account
     */
    public void execute(double amount) {
        account.deposit(amount);
    }
}