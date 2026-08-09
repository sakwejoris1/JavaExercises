import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number between 1 and 30: ");
            numbers[i] = input.nextInt();
        }

        System.out.println("\nBar chart:");
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= numbers[i]; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
