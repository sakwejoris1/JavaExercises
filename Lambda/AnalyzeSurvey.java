// Exercise 15.8 (part 2)
// Reads the responses from numbers.txt using a Scanner, counts how many
// times each rating (1-9) appears, and writes the results to output.txt.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AnalyzeSurvey {
    public static void main(String[] args) {
        // frequency[1] through frequency[9] hold the counts; index 0 is unused
        int[] frequency = new int[10];

        try (Scanner fileInput = new Scanner(new File("numbers.txt"))) {
            while (fileInput.hasNextInt()) {
                int response = fileInput.nextInt();
                if (response >= 1 && response <= 9) {
                    frequency[response]++;
                } else {
                    System.out.println("Invalid response found in file: " + response);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("numbers.txt not found. Run CreateSurveyFile first.");
            return;
        }

        try (PrintWriter output = new PrintWriter(new FileWriter("output.txt"))) {
            output.println("Rating\tFrequency");
            for (int rating = 1; rating <= 9; rating++) {
                output.println(rating + "\t" + frequency[rating]);
            }
            System.out.println("Results saved to output.txt");
        } catch (IOException e) {
            System.out.println("Error creating output.txt: " + e.getMessage());
        }
    }
}
