public class PrintArrayStrings {

    // Generic version: works for any array type, all on one line
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Nongeneric overload: specifically for String[], one element per line
    public static void printArray(String[] stringArray) {
        System.out.println("Array stringArray contains:");
        for (String element : stringArray) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"one", "two", "three", "four", "five", "six", "seven", "eight"};

        System.out.println("Calling the generic version with Integers:");
        printArray(integerArray); // uses the generic <T> version

        System.out.println("\nCalling the overload with Strings:");
        printArray(stringArray); // the compiler picks the String-specific version
    }
}
