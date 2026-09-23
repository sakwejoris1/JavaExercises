// Exercise 18.11 (Greatest Common Divisor)
// gcd(x, y) is defined recursively as:
//   if y == 0, gcd(x, y) is x
//   otherwise, gcd(x, y) is gcd(y, x % y)
import java.util.Scanner;

public class RecursiveGCD {

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int x = input.nextInt();

        System.out.print("Enter the second integer: ");
        int y = input.nextInt();

        System.out.println("The greatest common divisor of " + x + " and " + y
            + " is " + gcd(x, y));
    }
}
