// Exercise 18.9 (Recursive power Method)
// Calculates base^exponent recursively, using the relationship:
//     base^exponent = base * base^(exponent - 1)
// and the terminating (base) case:
//     base^1 = base
import java.util.Scanner;

public class RecursivePower {

    public static int power(int base, int exponent) {
        if (exponent == 1) {
            return base; // base case: base^1 is just base
        } else {
            return base * power(base, exponent - 1); // recursive step
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = input.nextInt();

        System.out.print("Enter the exponent (1 or greater): ");
        int exponent = input.nextInt();

        int result = power(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
    }
}
