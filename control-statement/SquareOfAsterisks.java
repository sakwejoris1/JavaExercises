import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side length of the square (1-20): ");
        int side = input.nextInt();

        for (int row = 1; row <= side; row++) {
            for (int col = 1; col <= side; col++) {
                if (row == 1 || row == side || col == 1 || col == side) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
