import static java.lang.IO.print;

public class GenericPrintArray {

    // Original generic version: prints the entire array
    public static <T> void printArray(T[] array) {
        StringBuilder sb = new StringBuilder();
        for (T value : array) {
            sb.append(value).append(" ");
        }
        print(sb.toString());
    }

    // 20.5: Overloaded generic version that prints only a subrange [lowSubscript, highSubscript]
    // Validates the range and throws InvalidSubscriptException if it's out of bounds.
    // Returns the number of elements printed.
    public static <T> int printArray(T[] array, int lowSubscript, int highSubscript)
            throws InvalidSubscriptException {

        if (lowSubscript < 0) {
            throw new InvalidSubscriptException("lowSubscript (" + lowSubscript + ") is out of range");
        }
        if (highSubscript >= array.length) {
            throw new InvalidSubscriptException("highSubscript (" + highSubscript + ") is out of range");
        }
        if (lowSubscript > highSubscript) {
            throw new InvalidSubscriptException(
                    "lowSubscript (" + lowSubscript + ") cannot be greater than highSubscript (" + highSubscript + ")");
        }

        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = lowSubscript; i <= highSubscript; i++) {
            sb.append(array[i]).append(" ");
            count++;
        }
        print(sb.toString());
        return count;
    }

    // 20.6: Non-generic overload specifically for String arrays, printed in tabular format
    public static void printArray(String[] array) {
        print("Array stringArray contains:");
        for (String value : array) {
            print(value);
        }
    }

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"one", "two", "three", "four", "five", "six", "seven", "eight"};

        print("Full array output using generic printArray:");
        printArray(integerArray);
        printArray(doubleArray);
        printArray(characterArray);

        print("Ranged output using overloaded printArray:");
        try {
            int printed = printArray(integerArray, 1, 3);
            print("Elements printed: " + printed);

            printed = printArray(doubleArray, 0, 2);
            print("Elements printed: " + printed);

            printed = printArray(characterArray, 2, 4);
            print("Elements printed: " + printed);
        } catch (InvalidSubscriptException e) {
            print("Error: " + e.getMessage());
        }

        print("Testing invalid ranges (should throw exceptions):");
        try {
            printArray(integerArray, -1, 3); // low out of range
        } catch (InvalidSubscriptException e) {
            print("Error: " + e.getMessage());
        }

        try {
            printArray(doubleArray, 0, 10); // high out of range
        } catch (InvalidSubscriptException e) {
            print("Error: " + e.getMessage());
        }

        try {
            printArray(characterArray, 3, 1); // low > high
        } catch (InvalidSubscriptException e) {
            print("Error: " + e.getMessage());
        }

        print("Non-generic String printArray:");
        printArray(stringArray);
    }
}
