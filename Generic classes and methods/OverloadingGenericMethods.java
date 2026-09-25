public class OverloadingGenericMethods {

    // Version 1: one array parameter
    public static <T> void display(T[] array) {
        System.out.print("One array: ");
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Version 2 (overload): two array parameters - a different parameter
    // LIST is what makes this legal, even though the method name is the same
    public static <T> void display(T[] array1, T[] array2) {
        System.out.print("Two arrays: ");
        for (T element : array1) {
            System.out.print(element + " ");
        }
        System.out.print("| ");
        for (T element : array2) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] numbers1 = {1, 2, 3};
        Integer[] numbers2 = {4, 5, 6};

        display(numbers1);            // calls version 1
        display(numbers1, numbers2);  // calls version 2
    }
}
