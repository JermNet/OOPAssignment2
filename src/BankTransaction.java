/**
 * This is a simple class meant to represent a bank transaction with polymorphic
 * methods to deposit money into a bank and savings accounts
 *
 * @author Jeremy D. W.
 * @version 2/22/2024
 */
class BankTransaction {

    /**
     * This uses the deposit method from the BankAccount class to add money into an
     * account
     *
     * @param account an instance of the BankAccount class
     * @param amount  used to specify the amount to be put into the account
     */
    public void executeTransaction(BankAccount account, double amount) {
        account.deposit(amount);
    }

    /**
     * This uses the deposit and applyInterest methods from the SavingsAccount class
     * to add money to an account and then apply interest to the account as a whole
     *
     * @param account an instance of the SavingsAccount class
     * @param amount  used to specify the amount to be put into the account
     */
    public void executeTransaction(SavingsAccount account, double amount) {
        account.deposit(amount);
        account.applyInterest();
    }
}
