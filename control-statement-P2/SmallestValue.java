import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values to input: ");
        int count = input.nextInt();

        System.out.print("Enter value 1: ");
        int smallest = input.nextInt();

        for (int i = 2; i <= count; i++) {
            System.out.print("Enter value " + i + ": ");
            int value = input.nextInt();

            if (value < smallest) {
                smallest = value;
            }
        }

        System.out.println("Smallest value: " + smallest);
    }
}
