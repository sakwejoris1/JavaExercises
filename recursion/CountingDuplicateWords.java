// Exercise 16.16 (Counting Duplicate Words)
// Reads a sentence and prints how many words appear more than once.
// Uppercase/lowercase are treated the same, and punctuation is ignored.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingDuplicateWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();

        // Lowercase everything, then remove anything that isn't a letter,
        // digit, or whitespace (this strips out punctuation like . , ! ?)
        String cleaned = sentence.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

        String[] words = cleaned.split("\\s+");

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        System.out.println("\nDuplicate words found:");
        int duplicateCount = 0;
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("\"" + entry.getKey() + "\" appears " + entry.getValue() + " times");
                duplicateCount++;
            }
        }

        System.out.println("\nNumber of words that have duplicates: " + duplicateCount);
    }
}
