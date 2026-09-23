// Exercise 18.12 (What does the following program do?)
// This is the exact program given in the exercise.
//
// ANSWER: The mystery method adds up every element of the array.
// It works from the last index backward: when size is 1, it just returns
// array2[0]. Otherwise it returns the last element (array2[size - 1]) plus
// the result of calling itself on everything before that element. So for
// {1, 2, 3, ..., 10}, it computes 1 + 2 + 3 + ... + 10 = 55.
// In short: this program calculates and prints the SUM of the array's elements.
public class MysteryClass_18_12 {
    public static int mystery(int[] array2, int size) {
        if (size == 1) {
            return array2[0];
        } else {
            return array2[size - 1] + mystery(array2, size - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int result = mystery(array, array.length);
        System.out.printf("Result is: %d%n", result);
    }
}
