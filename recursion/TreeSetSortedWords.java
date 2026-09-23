// Exercise 16.20 (Sorting Words with a TreeSet)
// Reads a line of text, splits it into words with String.split, and puts
// each word into a TreeSet, which automatically keeps them sorted.
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSortedWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String line = input.nextLine();

        // Split on one or more spaces
        String[] words = line.split("\\s+");

        Set<String> sortedWords = new TreeSet<>();
        for (String word : words) {
            sortedWords.add(word);
        }

        System.out.println("\nWords in ascending sorted order:");
        for (String word : sortedWords) {
            System.out.println(word);
        }
    }
}
