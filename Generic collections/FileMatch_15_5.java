// Exercise 15.4 part (d)
// Reads oldmast.txt and trans.txt, matches them up by account number,
// and writes newmast.txt (updated accounts) and log.txt (unmatched transactions).
//
// How it works, step by step:
//   1. Read every account from oldmast.txt into a list.
//   2. Read every transaction from trans.txt into a list.
//   3. For each account, look through the transactions for any that match its
//      account number, and add them to the account's balance.
//   4. Write every account (updated or not) to newmast.txt.
//   5. Any transaction that never matched an account gets written to log.txt.
import java.io.*;
import java.util.*;

public class FileMatch_15_5 {
    public static void main(String[] args) {
        List<Account_15_5> masterAccounts = new ArrayList<>();
        List<TransactionRecord_15_5> transactions = new ArrayList<>();

        // Step 1: read oldmast.txt
        try (BufferedReader reader = new BufferedReader(new FileReader("oldmast.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int accountNumber = Integer.parseInt(parts[0]);
                String name = parts[1];
                double balance = Double.parseDouble(parts[2]);
                masterAccounts.add(new Account_15_5(accountNumber, name, balance));
            }
        } catch (IOException e) {
            System.out.println("Error reading oldmast.txt: " + e.getMessage());
        }

        // Step 2: read trans.txt
        try (BufferedReader reader = new BufferedReader(new FileReader("trans.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int accountNumber = Integer.parseInt(parts[0]);
                double amount = Double.parseDouble(parts[1]);
                transactions.add(new TransactionRecord_15_5(accountNumber, amount));
            }
        } catch (IOException e) {
            System.out.println("Error reading trans.txt: " + e.getMessage());
        }

        // Step 3, 4 and 5: match, update, and write the results
        try (PrintWriter newMaster = new PrintWriter(new FileWriter("newmast.txt"));
             PrintWriter log = new PrintWriter(new FileWriter("log.txt"))) {

            // Keeps track of which transactions were matched to an account
            boolean[] transactionUsed = new boolean[transactions.size()];

            for (Account_15_5 account : masterAccounts) {
                for (int i = 0; i < transactions.size(); i++) {
                    TransactionRecord_15_5 t = transactions.get(i);
                    if (t.getAccountNumber() == account.getAccountNumber()) {
                        account.combine(t);
                        transactionUsed[i] = true;
                    }
                }
                newMaster.println(account.toFileLine());
            }

            // Any transaction that was never matched has no account to belong to
            for (int i = 0; i < transactions.size(); i++) {
                if (!transactionUsed[i]) {
                    TransactionRecord_15_5 t = transactions.get(i);
                    log.println("Unmatched transaction record for account number " + t.getAccountNumber());
                }
            }

            System.out.println("newmast.txt and log.txt created.");
        } catch (IOException e) {
            System.out.println("Error writing output files: " + e.getMessage());
        }
    }
}
