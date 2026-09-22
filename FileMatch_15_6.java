// Exercise 15.6
// Same matching logic as Exercise 15.5, but it reads the accounts and
// transactions back using ObjectInputStream instead of a text-file Scanner,
// and writes the updated accounts to newmast.ser with ObjectOutputStream.
// The log of unmatched transactions is still plain text, since that's just
// a simple message for a person to read.
import java.io.*;
import java.util.ArrayList;

public class FileMatch_15_6 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<Account_15_6> masterAccounts = new ArrayList<>();
        ArrayList<TransactionRecord_15_6> transactions = new ArrayList<>();

        // Read the accounts back from oldmast.ser
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("oldmast.ser"))) {
            masterAccounts = (ArrayList<Account_15_6>) input.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading oldmast.ser: " + e.getMessage());
        }

        // Read the transactions back from trans.ser
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("trans.ser"))) {
            transactions = (ArrayList<TransactionRecord_15_6>) input.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading trans.ser: " + e.getMessage());
        }

        boolean[] transactionUsed = new boolean[transactions.size()];

        // Match every transaction to its account and update the balance
        for (Account_15_6 account : masterAccounts) {
            for (int i = 0; i < transactions.size(); i++) {
                TransactionRecord_15_6 t = transactions.get(i);
                if (t.getAccountNumber() == account.getAccountNumber()) {
                    account.combine(t);
                    transactionUsed[i] = true;
                }
            }
        }

        // Save the updated accounts to newmast.ser
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("newmast.ser"))) {
            output.writeObject(masterAccounts);
            System.out.println("newmast.ser created.");
        } catch (IOException e) {
            System.out.println("Error writing newmast.ser: " + e.getMessage());
        }

        // Log any transaction that never matched an account
        try (PrintWriter log = new PrintWriter(new FileWriter("log.txt"))) {
            for (int i = 0; i < transactions.size(); i++) {
                if (!transactionUsed[i]) {
                    TransactionRecord_15_6 t = transactions.get(i);
                    log.println("Unmatched transaction record for account number " + t.getAccountNumber());
                }
            }
            System.out.println("log.txt created.");
        } catch (IOException e) {
            System.out.println("Error writing log.txt: " + e.getMessage());
        }
    }
}
