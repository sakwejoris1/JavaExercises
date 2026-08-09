public class TrianglePrinting {
    public static void main(String[] args) {
        // Pattern (a)
        for (int row = 1; row <= 9; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        // Pattern (b)
        for (int row = 9; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        // Pattern (c)
        for (int row = 1; row <= 9; row++) {
            for (int space = 1; space <= 9 - row; space++) {
                System.out.print(' ');
            }
            for (int col = 1; col <= row; col++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        // Pattern (d)
        for (int row = 9; row >= 1; row--) {
            for (int space = 1; space <= 9 - row; space++) {
                System.out.print(' ');
            }
            for (int col = 1; col <= row; col++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
