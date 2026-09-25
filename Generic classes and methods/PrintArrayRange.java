import java.util.Arrays;

public class PrintArrayRange {

    // Original version: prints every element of the array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Overloaded version: prints only elements from lowSubscript to
    // highSubscript (inclusive). Returns how many elements were printed.
    // Throws InvalidSubscriptException if either subscript is out of range.
    public static <T> int printArray(T[] array, int lowSubscript, int highSubscript)
            throws InvalidSubscriptException {

        if (lowSubscript < 0 || lowSubscript >= array.length) {
            throw new InvalidSubscriptException("lowSubscript (" + lowSubscript + ") is out of range.");
        }
        if (highSubscript < 0 || highSubscript >= array.length) {
            throw new InvalidSubscriptException("highSubscript (" + highSubscript + ") is out of range.");
        }
        if (lowSubscript > highSubscript) {
            throw new InvalidSubscriptException("lowSubscript cannot be greater than highSubscript.");
        }

        int count = 0;
        for (int i = lowSubscript; i <= highSubscript; i++) {
            System.out.print(array[i] + " ");
            count++;
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Full integerArray:");
        printArray(integerArray);

        System.out.println("\nFull doubleArray:");
        printArray(doubleArray);

        System.out.println("\nFull characterArray:");
        printArray(characterArray);

        // Now test the ranged overload, including invalid ranges
        try {
            System.out.println("\nintegerArray from index 2 to 5:");
            int printed = printArray(integerArray, 2, 5);
            System.out.println("Elements printed: " + printed);

            System.out.println("\ndoubleArray from index 0 to 2:");
            printed = printArray(doubleArray, 0, 2);
            System.out.println("Elements printed: " + printed);

            System.out.println("\ncharacterArray from index 1 to 3:");
            printed = printArray(characterArray, 1, 3);
            System.out.println("Elements printed: " + printed);

            // This one is intentionally out of range, to test validation
            System.out.println("\nTrying an out-of-range call (index 2 to 50):");
            printArray(integerArray, 2, 50);

        } catch (InvalidSubscriptException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
