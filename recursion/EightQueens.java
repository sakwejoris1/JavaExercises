// Exercise 18.15 (Eight Queens)
// Places 8 queens on an 8x8 board so that none of them attack each other
// (no two queens share a row, column, or diagonal), using recursive
// backtracking. The board is printed as text (Q for a queen, . for empty).
public class EightQueens {

    private static final int SIZE = 8;
    // columnForRow[row] holds which column the queen in that row is in
    private static int[] columnForRow = new int[SIZE];

    public static void main(String[] args) {
        if (solve(0)) {
            System.out.println("Solution found:\n");
            printBoard();
        } else {
            System.out.println("No solution found.");
        }
    }

    // Tries to place a queen in every row, starting from "row"
    private static boolean solve(int row) {
        if (row == SIZE) {
            return true; // base case: every row has a queen placed safely
        }

        for (int column = 0; column < SIZE; column++) {
            if (isSafe(row, column)) {
                columnForRow[row] = column; // place the queen

                if (solve(row + 1)) { // recursively place the rest
                    return true;
                }
                // otherwise, backtrack and try the next column in this row
            }
        }

        return false; // no column in this row worked
    }

    // Checks whether placing a queen at (row, column) conflicts with any
    // queen already placed in an earlier row
    private static boolean isSafe(int row, int column) {
        for (int previousRow = 0; previousRow < row; previousRow++) {
            int previousColumn = columnForRow[previousRow];

            boolean sameColumn = (previousColumn == column);
            boolean sameDiagonal = Math.abs(previousColumn - column) == Math.abs(previousRow - row);

            if (sameColumn || sameDiagonal) {
                return false;
            }
        }
        return true;
    }

    private static void printBoard() {
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                if (columnForRow[row] == column) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
