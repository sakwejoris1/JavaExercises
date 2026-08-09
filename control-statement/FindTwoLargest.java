import java.util.Scanner;

public class FindTwoLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int counter = 1; counter <= 10; counter++) {
            System.out.print("Enter number " + counter + ": ");
            int number = input.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second largest: " + secondLargest);
    }
}
