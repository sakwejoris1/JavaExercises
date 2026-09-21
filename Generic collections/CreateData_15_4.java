// Exercise 15.4 part (c)
// Creates the two starting files: oldmast.txt (master file) and trans.txt (transactions).
// The data here comes straight from Fig. 15.14 and Fig. 15.15 in the textbook.
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class CreateData_15_4 {
    public static void main(String[] args) {

        // Create the master file
        try (PrintWriter masterWriter = new PrintWriter(new FileWriter("oldmast.txt"))) {
            masterWriter.println("100,Alan Jones,348.17");
            masterWriter.println("300,Mary Smith,27.19");
            masterWriter.println("500,Sam Sharp,0.00");
            masterWriter.println("700,Suzy Green,-14.22");
            System.out.println("oldmast.txt created.");
        } catch (IOException e) {
            System.out.println("Error writing oldmast.txt: " + e.getMessage());
        }

        // Create the transaction file
        try (PrintWriter transWriter = new PrintWriter(new FileWriter("trans.txt"))) {
            transWriter.println("100,27.14");
            transWriter.println("300,62.11");
            transWriter.println("400,100.56");
            transWriter.println("900,82.17");
            System.out.println("trans.txt created.");
        } catch (IOException e) {
            System.out.println("Error writing trans.txt: " + e.getMessage());
        }
    }
}
