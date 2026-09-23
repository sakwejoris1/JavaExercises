// Exercise 18.23 (Time to Calculate Fibonacci Numbers)
// NOTE: Fig. 18.5 (the original Fibonacci program) wasn't provided, so
// this is a self-contained recursive Fibonacci method with the two things
// the exercise asks for added: a call counter, and timing using
// System.currentTimeMillis() called before and after the calculation.
import java.util.Scanner;

public class FibonacciTiming {

    // Counts how many times fibonacci() has been called
    private static long callCount = 0;

    public static long fibonacci(int n) {
        callCount++;

        if (n == 0 || n == 1) {
            return n; // base cases
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // recursive step
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();

        long startTime = System.currentTimeMillis();
        long result = fibonacci(n);
        long endTime = System.currentTimeMillis();

        System.out.println("Fibonacci(" + n + ") = " + result);
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
        System.out.println("Number of recursive calls made: " + callCount);
    }
}
