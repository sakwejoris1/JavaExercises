// Exercise 18.14 (Palindromes)
// Recursively checks whether a String is a palindrome (reads the same
// forward and backward), ignoring spaces and punctuation, case-insensitive.
import java.util.Scanner;

public class Palindrome {

    // Checks characters from "left" and "right" moving toward the middle
    public static boolean testPalindrome(char[] array, int left, int right) {
        // Skip over any character that isn't a letter or digit
        while (left < right && !Character.isLetterOrDigit(array[left])) {
            left++;
        }
        while (left < right && !Character.isLetterOrDigit(array[right])) {
            right--;
        }

        // Base case: the pointers have met or crossed, so it's a palindrome
        if (left >= right) {
            return true;
        }

        // If the two characters don't match, it's not a palindrome
        if (Character.toLowerCase(array[left]) != Character.toLowerCase(array[right])) {
            return false;
        }

        // Recursive step: check the rest of the string, moving inward
        return testPalindrome(array, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = input.nextLine();

        char[] array = text.toCharArray();
        boolean result = testPalindrome(array, 0, array.length - 1);

        if (result) {
            System.out.println("\"" + text + "\" IS a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a palindrome.");
        }
    }
}
