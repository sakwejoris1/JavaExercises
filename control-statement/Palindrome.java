import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        boolean valid = false;

        do {
            System.out.print("Enter a five-digit integer: ");
            number = input.nextInt();

            if (number < 10000 || number > 99999) {
                System.out.println("Error: number must be exactly 5 digits.");
            } else {
                valid = true;
            }
        } while (!valid);

        int original = number;
        int reversed = 0;

        while (number != 0) {
            reversed = (reversed * 10) + (number % 10);
            number /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
