// Exercise 15.6
// Same as before, but "implements Serializable" so objects of this class
// can be saved directly into a file with ObjectOutputStream.
import java.io.Serializable;

public class TransactionRecord_15_6 implements Serializable {
    private int accountNumber;
    private double amount;

    public TransactionRecord_15_6(int accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
