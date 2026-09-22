// Exercise 17.12 (Duplicate Word Removal)
// Reads a sentence (no punctuation assumed), then displays the unique
// words in alphabetical order. Uppercase and lowercase are treated the same.
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UniqueWordsAlphabetical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence (no punctuation):");
        String sentence = input.nextLine();

        String[] words = sentence.toLowerCase().split("\\s+");

        List<String> uniqueSortedWords = Arrays.stream(words)
            .distinct()
            .sorted()
            .collect(Collectors.toList());

        System.out.println("\nUnique words in alphabetical order:");
        uniqueSortedWords.forEach(System.out::println);
    }
}
