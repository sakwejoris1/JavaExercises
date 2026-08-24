import static java.lang.IO.print;

public class GenericSelectionSort {

    // Generic selection sort: works for any type T that implements Comparable<T>
    public static <T extends Comparable<T>> void selectionSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallestIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[smallestIndex]) < 0) {
                    smallestIndex = j;
                }
            }

            if (smallestIndex != i) {
                T temp = array[i];
                array[i] = array[smallestIndex];
                array[smallestIndex] = temp;
            }
        }
    }

    public static <T> void printArray(T[] array) {
        StringBuilder sb = new StringBuilder();
        for (T value : array) {
            sb.append(value).append(" ");
        }
        print(sb.toString());
    }

    public static void main(String[] args) {
        Integer[] integerArray = {8, 22, 4, 39, 17, 90, 12, 46, 5, 63};
        Float[] floatArray = {8.4f, 22.1f, 4.9f, 39.3f, 17.7f, 90.2f, 12.5f, 46.6f, 5.1f, 63.8f};

        print("Integer array before sorting:");
        printArray(integerArray);
        selectionSort(integerArray);
        print("Integer array after sorting:");
        printArray(integerArray);

        print("Float array before sorting:");
        printArray(floatArray);
        selectionSort(floatArray);
        print("Float array after sorting:");
        printArray(floatArray);
    }
}
