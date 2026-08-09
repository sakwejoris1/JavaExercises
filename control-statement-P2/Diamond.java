public class Diamond {
    public static void main(String[] args) {
        int rows = 9;
        int mid = (rows / 2) + 1;

        // Top half (including middle row)
        for (int row = 1; row <= mid; row++) {
            for (int space = 1; space <= mid - row; space++) {
                System.out.print(' ');
            }
            for (int star = 1; star <= (2 * row) - 1; star++) {
                System.out.print('*');
            }
            System.out.println();
        }

        // Bottom half
        for (int row = mid - 1; row >= 1; row--) {
            for (int space = 1; space <= mid - row; space++) {
                System.out.print(' ');
            }
            for (int star = 1; star <= (2 * row) - 1; star++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
