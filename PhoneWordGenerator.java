// Exercise 15.7
// Given a 7-digit phone number (digits 2-9 only), this writes every possible
// 7-letter word combination to phonewords.txt. There are 3^7 = 2187 of them.
//
// How it works:
//   Each digit 2-9 maps to 3 letters (like an old phone keypad). We build the
//   word one position at a time. For position 0 we try all 3 letters for the
//   first digit; for EACH of those we try all 3 letters for the second digit,
//   and so on. This "try everything, one step at a time" pattern is called
//   recursion, and it naturally produces every combination.
import java.io.*;
import java.util.Scanner;

public class PhoneWordGenerator {

    // Index 0 and 1 are empty strings because digits 0 and 1 have no letters
    private static final String[] DIGIT_LETTERS = {
        "", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PRS", "TUV", "WXY"
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 7-digit phone number (digits 2-9 only): ");
        String phoneNumber = input.nextLine();

        if (phoneNumber.length() != 7 || !isValid(phoneNumber)) {
            System.out.println("Invalid phone number. Use exactly 7 digits, each between 2 and 9.");
            return;
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter("phonewords.txt"))) {
            char[] word = new char[7];
            generateWords(phoneNumber, 0, word, writer);
            System.out.println("All combinations written to phonewords.txt");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    // Makes sure every character is a digit from 2 to 9
    private static boolean isValid(String phoneNumber) {
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (c < '2' || c > '9') {
                return false;
            }
        }
        return true;
    }

    // Fills in "word" one letter at a time, trying every letter for the
    // digit at "position". When the word is full (position == 7), it's
    // written to the file.
    private static void generateWords(String phoneNumber, int position, char[] word, PrintWriter writer) {
        if (position == phoneNumber.length()) {
            writer.println(new String(word));
            return;
        }

        int digit = phoneNumber.charAt(position) - '0';
        String letters = DIGIT_LETTERS[digit];

        for (int i = 0; i < letters.length(); i++) {
            word[position] = letters.charAt(i);
            generateWords(phoneNumber, position + 1, word, writer);
        }
    }
}
