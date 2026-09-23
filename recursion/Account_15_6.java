// Exercise 15.6
// Same as before, but "implements Serializable" so objects of this class
// can be saved directly into a file with ObjectOutputStream.
import java.io.Serializable;

public class Account_15_6 implements Serializable {
    private int accountNumber;
    private String name;
    private double balance;

    public Account_15_6(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void combine(TransactionRecord_15_6 transaction) {
        balance = balance + transaction.getAmount();
    }

    public String toString() {
        return accountNumber + "," + name + "," + balance;
    }
}
