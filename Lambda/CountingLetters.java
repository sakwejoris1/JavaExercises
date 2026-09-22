// Exercise 16.14 (Counting Letters)
// NOTE: Fig. 16.18 (the original word-counting program) was not provided,
// so this is a self-contained rewrite that follows the same idea, but
// counts LETTERS instead of WORDS, as the exercise asks.
//
// Example: "HELLO THERE" -> two Hs, three Es, two Ls, one O, one T, one R.
import java.util.Map;
import java.util.TreeMap;

public class CountingLetters {
    public static void main(String[] args) {
        String text = "HELLO THERE";

        // TreeMap keeps the letters in alphabetical order automatically
        Map<Character, Integer> letterCounts = new TreeMap<>();

        // Convert to uppercase so 'h' and 'H' count as the same letter
        String upperText = text.toUpperCase();

        for (int i = 0; i < upperText.length(); i++) {
            char c = upperText.charAt(i);

            // Only count actual letters, skip spaces and punctuation
            if (Character.isLetter(c)) {
                if (letterCounts.containsKey(c)) {
                    int currentCount = letterCounts.get(c);
                    letterCounts.put(c, currentCount + 1);
                } else {
                    letterCounts.put(c, 1);
                }
            }
        }

        System.out.println("Letter counts for: \"" + text + "\"");
        for (Map.Entry<Character, Integer> entry : letterCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
