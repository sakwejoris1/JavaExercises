import java.util.Arrays;

public class SelectionSort {

    // Selection sort: repeatedly find the smallest remaining element and
    // swap it into its correct position.
    public static <T extends Comparable<T>> void selectionSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallestIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[smallestIndex]) < 0) {
                    smallestIndex = j;
                }
            }

            // Swap the smallest found into position i
            T temp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] integerArray = {8, 2, 9, 4, 1, 6};
        Float[] floatArray = {3.3f, 1.1f, 4.4f, 2.2f};

        System.out.println("Integer array before: " + Arrays.toString(integerArray));
        selectionSort(integerArray);
        System.out.println("Integer array after:  " + Arrays.toString(integerArray));

        System.out.println("\nFloat array before: " + Arrays.toString(floatArray));
        selectionSort(floatArray);
        System.out.println("Float array after:  " + Arrays.toString(floatArray));
    }
}
