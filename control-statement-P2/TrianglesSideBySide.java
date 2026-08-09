public class TrianglesSideBySide {
    public static void main(String[] args) {
        int rows = 9;

        for (int row = 1; row <= rows; row++) {
            // Pattern (a)
            for (int col = 1; col <= row; col++) {
                System.out.print('*');
            }
            for (int pad = row; pad <= rows; pad++) {
                System.out.print(' ');
            }
            System.out.print(' ');

            // Pattern (b)
            for (int col = 1; col <= rows - row + 1; col++) {
                System.out.print('*');
            }
            for (int pad = rows - row + 1; pad < rows; pad++) {
                System.out.print(' ');
            }
            System.out.print(' ');

            // Pattern (c)
            for (int space = 1; space <= rows - row; space++) {
                System.out.print(' ');
            }
            for (int col = 1; col <= row; col++) {
                System.out.print('*');
            }
            System.out.print(' ');

            // Pattern (d)
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(' ');
            }
            for (int col = 1; col <= rows - row + 1; col++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }
}
