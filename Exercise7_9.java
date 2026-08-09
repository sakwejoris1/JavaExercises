import java.util.Scanner;

public class Exercise7_9 {
    public static void main(String[] args) {

        // ----- a) Declare and create a 2-by-3 integer array t -----
        int[][] t = new int[2][3];

        // ----- b) Number of rows -----
        int rows = t.length;
        System.out.println("Rows: " + rows);

        // ----- c) Number of columns -----
        int columns = t[0].length;
        System.out.println("Columns: " + columns);

        // ----- d) Number of elements -----
        int elements = t.length * t[0].length;
        System.out.println("Total elements: " + elements);

        // ----- e) Access expressions for all elements in row 1 -----
        // t[1][0], t[1][1], t[1][2]
        System.out.println("Row 1 elements: " + t[1][0] + ", " + t[1][1] + ", " + t[1][2]);

        // ----- f) Access expressions for all elements in column 2 -----
        // t[0][2], t[1][2]
        System.out.println("Column 2 elements: " + t[0][2] + ", " + t[1][2]);

        // ----- g) Single statement to set t[0][1] to zero -----
        t[0][1] = 0;

        // ----- h) Individual statements to initialize each element of t to zero -----
        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;

        // ----- i) Nested for statement that initializes each element of t to zero -----
        for (int row = 0; row < t.length; row++) {
            for (int col = 0; col < t[row].length; col++) {
                t[row][col] = 0;
            }
        }

        // ----- j) Nested for statement that inputs values for t from the user -----
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < t.length; row++) {
            for (int col = 0; col < t[row].length; col++) {
                System.out.printf("Enter value for t[%d][%d]: ", row, col);
                t[row][col] = input.nextInt();
            }
        }

        // ----- k) Determine and display the smallest value in t -----
        int smallest = t[0][0];
        for (int row = 0; row < t.length; row++) {
            for (int col = 0; col < t[row].length; col++) {
                if (t[row][col] < smallest) {
                    smallest = t[row][col];
                }
            }
        }
        System.out.println("Smallest value in t: " + smallest);

        // ----- l) Single printf statement that displays the elements of the first row of t -----
        System.out.printf("%d %d %d%n", t[0][0], t[0][1], t[0][2]);

        // ----- m) Total the elements of the third column of t (no repetition) -----
        int thirdColumnTotal = t[0][2] + t[1][2];
        System.out.println("Third column total: " + thirdColumnTotal);

        // ----- n) Display the contents of t in tabular format -----
        System.out.print("     "); // spacing for row-index column
        for (int col = 0; col < t[0].length; col++) {
            System.out.printf("col%d  ", col);
        }
        System.out.println();

        for (int row = 0; row < t.length; row++) {
            System.out.printf("row%d ", row);
            for (int col = 0; col < t[row].length; col++) {
                System.out.printf("%-6d", t[row][col]);
            }
            System.out.println();
        }

        input.close();
    }
}
