// Exercise 18.13 (What does the following program do?)
// This is the exact program given in the exercise.
//
// ANSWER: someMethod prints the array in REVERSE order.
// For each call it first recurses all the way to the end of the array
// (building up "" at the base case), and only AFTER that recursive call
// returns does it tack its own array2[x] onto the end of the string.
// Because the deepest call (the last element) finishes first and gets
// placed first in the string, the elements end up printed from last to
// first. For {1, 2, ..., 10}, it prints: "10 9 8 7 6 5 4 3 2 1 "
public class SomeClass_18_13 {
    public static String someMethod(int[] array2, int x) {
        if (x < array2.length) {
            return String.format(
                "%s%d ", someMethod(array2, x + 1), array2[x]);
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String results = someMethod(array, 0);
        System.out.println(results);
    }
}
