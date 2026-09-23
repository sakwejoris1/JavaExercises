// Exercise 18.16 (Print an Array)
// Recursively prints every element of an int array, separated by spaces.
public class PrintArray {

    public static void printArray(int[] array, int index) {
        if (index == array.length) {
            return; // base case: reached the end of the array
        }

        System.out.print(array[index] + " ");
        printArray(array, index + 1); // recursive step: print the rest
    }

    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};

        System.out.print("Array contents: ");
        printArray(numbers, 0);
        System.out.println();
    }
}
