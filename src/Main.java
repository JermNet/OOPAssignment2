/**
 * Meant to use the provided classes to demonstrate the 4 pillars of OOP. These
 * pillars are described in detail in each of the classes they're primarily used
 * in. But, in short, the first block
 * of code uses encapsulation, the second inheritance, the third polymorphism,
 * and the fourth abstraction
 *
 * @author Jeremy D. W.
 * @version 2/22/2024
 */
public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        System.out.println("Balance: $" + account.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(2000, 0.05);
        savingsAccount.applyInterest();
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());

        BankTransaction transaction = new BankTransaction();
        transaction.executeTransaction(account, 200);
        transaction.executeTransaction(savingsAccount, 300);

        Transaction depositTransaction = new DepositTransaction(account);
        depositTransaction.execute(150);
        Transaction withdrawalTransaction = new WithdrawTransaction(account);
        withdrawalTransaction.execute(50);
        System.out.println("Final Balance: $" + account.getBalance());
    }
}