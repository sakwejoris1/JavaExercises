// Exercise 15.4 part (b)
// A simple class that holds one customer account: account number, name, balance.
public class Account {
    private int accountNumber;
    private String name;
    private double balance;

    public Account(int accountNumber, String name, double balance) {
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

    // Adds the transaction's amount to this account's balance.
    public void combine(TransactionRecord transaction) {
        balance = balance + transaction.getAmount();
    }

    // Turns this account into one comma-separated line, ready to save to a file.
    public String toFileLine() {
        return accountNumber + "," + name + "," + balance;
    }
}
