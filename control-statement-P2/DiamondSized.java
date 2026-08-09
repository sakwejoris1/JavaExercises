import java.util.Scanner;

public class DiamondSized {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows;

        do {
            System.out.print("Enter an odd number of rows (1-19): ");
            rows = input.nextInt();
        } while (rows < 1 || rows > 19 || rows % 2 == 0);

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
