// Exercise 18.8 (Find the Error)
// The buggy method below is SUPPOSED to find the sum of the values from
// 0 to n, but it has a bug:
//
//     public int sum(int n) {
//         if (n == 0)
//             return 0;
//         else
//             return n + sum(n);     <-- BUG: calls sum(n) again, not sum(n - 1)
//     }
//
// THE ERROR:
//   The recursive call passes "n" again instead of a SMALLER value. Since
//   the argument never gets closer to the base case (n == 0), the method
//   calls itself forever and the program crashes with a StackOverflowError.
//
// THE FIX:
//   The recursive call should be sum(n - 1), so each call moves one step
//   closer to the base case.
import java.util.Scanner;

public class FindTheError_18_8 {

    // Corrected version of the method
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1); // FIXED: n - 1, not n
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer n: ");
        int n = input.nextInt();

        System.out.println("Sum from 0 to " + n + " is " + sum(n));
    }
}
