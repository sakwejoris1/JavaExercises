import static java.lang.IO.print;

public class RecursiveLinearSearch {

    // Recursively searches array for key, starting at index.
    // Returns the index if found, or -1 if not found.
    public static int recursiveLinearSearch(int[] array, int key, int index) {
        // Base case 1: ran off the end of the array without finding the key
        if (index >= array.length) {
            return -1;
        }

        // Base case 2: found the key at this index
        if (array[index] == key) {
            return index;
        }

        // Recursive case: check the next index
        return recursiveLinearSearch(array, key, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {8, 22, 4, 39, 17, 90, 12, 46, 5, 63};

        int[] testKeys = {39, 8, 63, 100}; // 100 is not in the array

        for (int key : testKeys) {
            int result = recursiveLinearSearch(array, key, 0);
            if (result != -1) {
                print(key + " found at index " + result);
            } else {
                print(key + " not found in array");
            }
        }
    }
}