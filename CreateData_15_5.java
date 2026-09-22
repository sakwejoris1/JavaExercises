// Exercise 15.5
// Same as exercise 15.4's CreateData_15_5, but trans.txt now also has extra
// transactions for accounts 300 and 700 (Fig. 15.16), so some accounts
// have more than one transaction record with the same account number.
//
// Note: FileMatch_15_5.java did NOT need to change for this exercise. Its inner
// loop already checks every transaction against every account, so it
// naturally adds up all matching transactions for one account.
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class CreateData_15_5 {
    public static void main(String[] args) {

        // Create the master file (unchanged from Exercise 15.4)
        try (PrintWriter masterWriter = new PrintWriter(new FileWriter("oldmast.txt"))) {
            masterWriter.println("100,Alan Jones,348.17");
            masterWriter.println("300,Mary Smith,27.19");
            masterWriter.println("500,Sam Sharp,0.00");
            masterWriter.println("700,Suzy Green,-14.22");
            System.out.println("oldmast.txt created.");
        } catch (IOException e) {
            System.out.println("Error writing oldmast.txt: " + e.getMessage());
        }

        // Create the transaction file, including the extra records from Fig. 15.16
        try (PrintWriter transWriter = new PrintWriter(new FileWriter("trans.txt"))) {
            transWriter.println("100,27.14");
            transWriter.println("300,62.11");
            transWriter.println("400,100.56");
            transWriter.println("900,82.17");
            // Extra transactions (Fig. 15.16) - notice 300 and 700 repeat
            transWriter.println("300,83.89");
            transWriter.println("700,80.78");
            transWriter.println("700,1.53");
            System.out.println("trans.txt created.");
        } catch (IOException e) {
            System.out.println("Error writing trans.txt: " + e.getMessage());
        }
    }
}
