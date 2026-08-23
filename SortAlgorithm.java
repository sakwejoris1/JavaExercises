import static java.lang.IO.print;

public class SortAlgorithm {
    public static void main(String[] args) {
        int[] array = {2, 6, 4, 8, 10, 12, 89, 68, 45, 37};

        print("Before sorting:");
        printArray(array);

        bubbleSort(array);

        print("After sorting:");
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false; // 19.6b: track whether any swap happened this pass

            for (int j = 0; j < array.length - 1 - i; j++) { // 19.6a: shrinking bound
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            print("After pass " + (i + 1) + ":");
            printArray(array);

            if (!swapped) {
                print("No swaps on this pass - array is sorted, stopping early.");
                break; // 19.6b: no swaps means the array is already sorted
            }
        }
    }

    public static void printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int value : array) {
            sb.append(value).append(" ");
        }
        print(sb.toString());
    }
}