// Exercise 15.6
// Same starting data as Exercise 15.5, but saved with object serialization
// instead of plain text. This writes oldmast.ser and trans.ser.
import java.io.*;
import java.util.ArrayList;

public class CreateData_15_6 {
    public static void main(String[] args) {

        // Build the list of accounts
        ArrayList<Account_15_6> accounts = new ArrayList<>();
        accounts.add(new Account_15_6(100, "Alan Jones", 348.17));
        accounts.add(new Account_15_6(300, "Mary Smith", 27.19));
        accounts.add(new Account_15_6(500, "Sam Sharp", 0.00));
        accounts.add(new Account_15_6(700, "Suzy Green", -14.22));

        // Build the list of transactions (including the Fig. 15.16 extras)
        ArrayList<TransactionRecord_15_6> transactions = new ArrayList<>();
        transactions.add(new TransactionRecord_15_6(100, 27.14));
        transactions.add(new TransactionRecord_15_6(300, 62.11));
        transactions.add(new TransactionRecord_15_6(400, 100.56));
        transactions.add(new TransactionRecord_15_6(900, 82.17));
        transactions.add(new TransactionRecord_15_6(300, 83.89));
        transactions.add(new TransactionRecord_15_6(700, 80.78));
        transactions.add(new TransactionRecord_15_6(700, 1.53));

        // Serialize the accounts list to oldmast.ser
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("oldmast.ser"))) {
            output.writeObject(accounts);
            System.out.println("oldmast.ser created.");
        } catch (IOException e) {
            System.out.println("Error writing oldmast.ser: " + e.getMessage());
        }

        // Serialize the transactions list to trans.ser
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("trans.ser"))) {
            output.writeObject(transactions);
            System.out.println("trans.ser created.");
        } catch (IOException e) {
            System.out.println("Error writing trans.ser: " + e.getMessage());
        }
    }
}
