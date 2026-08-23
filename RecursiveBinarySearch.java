import static java.lang.IO.print;

public class RecursiveBinarySearch {

    // Recursively searches sorted array for key within range [low, high].
    // Returns the index if found, or -1 if not found.
    public static int recursiveBinarySearch(int[] array, int key, int low, int high) {
        // Base case 1: search range has shrunk to nothing — key not found
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        // Base case 2: found the key at the middle
        if (array[mid] == key) {
            return mid;
        }

        // Recursive case: narrow to the left or right half
        if (key < array[mid]) {
            return recursiveBinarySearch(array, key, low, mid - 1);
        } else {
            return recursiveBinarySearch(array, key, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 8, 12, 17, 22, 39, 46, 63, 90}; // must be sorted

        int[] testKeys = {22, 3, 90, 100}; // 100 is not in the array

        for (int key : testKeys) {
            int result = recursiveBinarySearch(array, key, 0, array.length - 1);
            if (result != -1) {
                print(key + " found at index " + result);
            } else {
                print(key + " not found in array");
            }
        }
    }
}