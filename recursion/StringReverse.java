// Exercise 18.17 (Print an Array Backward)
// Recursively prints a String backward, using its char array.
import java.util.Scanner;

public class StringReverse {

    public static void stringReverse(char[] array, int index) {
        if (index < 0) {
            return; // base case: gone past the start of the array
        }

        System.out.print(array[index]);
        stringReverse(array, index - 1); // recursive step: move toward index 0
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = input.nextLine();

        char[] array = text.toCharArray();

        System.out.print("Reversed: ");
        stringReverse(array, array.length - 1);
        System.out.println();
    }
}
