// Exercise 15.8 (part 1)
// Asks the user to type in survey responses (ratings 1-9) one at a time,
// and saves them to numbers.txt using a Formatter. Type -1 to stop entering.
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class CreateSurveyFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try (Formatter output = new Formatter("numbers.txt")) {
            System.out.println("Enter survey responses (ratings 1-9). Type -1 to stop.");

            int response = input.nextInt();
            while (response != -1) {
                output.format("%d%n", response);
                response = input.nextInt();
            }

            System.out.println("Responses saved to numbers.txt");
        } catch (IOException e) {
            System.out.println("Error creating numbers.txt: " + e.getMessage());
        }
    }
}
