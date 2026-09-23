// Exercise 18.18 (Find the Minimum Value in an Array)
// Recursively finds the smallest element in an array of integers.
// The recursion "shrinks" the array by one element each call, and stops
// (the base case) once only one element is left.
import java.util.Arrays;

public class RecursiveMinimum {

    public static int recursiveMinimum(int[] array, int size) {
        if (size == 1) {
            return array[0]; // base case: only one element, so it IS the minimum
        }

        // Find the minimum of the first (size - 1) elements
        int minimumOfRest = recursiveMinimum(array, size - 1);

        // Compare that to the last element being considered at this level
        if (array[size - 1] < minimumOfRest) {
            return array[size - 1];
        } else {
            return minimumOfRest;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {42, 17, 8, 99, 3, 56, 21};

        System.out.println("Array: " + Arrays.toString(numbers));
        int minimum = recursiveMinimum(numbers, numbers.length);
        System.out.println("Minimum value: " + minimum);
    }
}
