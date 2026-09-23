// Exercise 17.13 (Sorting Letters and Removing Duplicates)
// Generates 30 random letters into a List, then:
//   a) sorts them ascending
//   b) sorts them descending
//   c) shows the ascending list with duplicates removed
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class SortRemoveDuplicateLetters {
    public static void main(String[] args) {
        Random random = new Random();
        List<Character> letters = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            char letter = (char) ('a' + random.nextInt(26));
            letters.add(letter);
        }

        System.out.println("Original list: " + letters);

        // (a) ascending order
        List<Character> ascending = new ArrayList<>(letters);
        Collections.sort(ascending);
        System.out.println("\n(a) Ascending order: " + ascending);

        // (b) descending order
        List<Character> descending = new ArrayList<>(letters);
        descending.sort(Collections.reverseOrder());
        System.out.println("\n(b) Descending order: " + descending);

        // (c) ascending order with duplicates removed
        List<Character> uniqueAscending = letters.stream()
            .distinct()
            .sorted()
            .collect(Collectors.toList());
        System.out.println("\n(c) Ascending order, duplicates removed: " + uniqueAscending);
    }
}
