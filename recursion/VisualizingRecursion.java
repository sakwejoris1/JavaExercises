// Exercise 18.10 (Visualizing Recursion)
// NOTE: Fig. 18.3 (the original factorial method) wasn't provided, so this
// is a self-contained factorial method that prints its local variable and
// parameter on every call, indenting one extra level for each recursive
// call, so you can literally watch the recursion "go deep" and then
// "unwind" back out.
import java.util.Scanner;

public class VisualizingRecursion {

    // "depth" tracks how many levels deep we are, purely for indentation
    public static long factorial(int number, int depth) {
        String indent = "  ".repeat(depth); // two spaces per level

        System.out.println(indent + "factorial(" + number + ") called");

        if (number <= 1) {
            System.out.println(indent + "-> base case reached, returning 1");
            return 1;
        } else {
            System.out.println(indent + "-> needs factorial(" + (number - 1) + ") first");
            long result = number * factorial(number - 1, depth + 1);
            System.out.println(indent + "<- factorial(" + number + ") returns " + result);
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();

        long result = factorial(number, 0);
        System.out.println("\n" + number + "! = " + result);
    }
}
