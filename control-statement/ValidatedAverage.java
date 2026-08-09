import java.util.Scanner;

public class ValidatedAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 0;
        int choice;

        System.out.println("1 to enter a grade");
        System.out.println("2 to end input");

        System.out.print("Enter choice: ");
        choice = input.nextInt();

        while (choice != 1 && choice != 2) {
            System.out.print("Invalid choice. Enter 1 or 2: ");
            choice = input.nextInt();
        }

        while (choice == 1) {
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            total += grade;
            ++gradeCounter;

            System.out.print("Enter choice (1 to continue, 2 to end): ");
            choice = input.nextInt();

            while (choice != 1 && choice != 2) {
                System.out.print("Invalid choice. Enter 1 or 2: ");
                choice = input.nextInt();
            }
        }

        if (gradeCounter != 0) {
            System.out.printf("Average: %.2f%n", (double) total / gradeCounter);
        } else {
            System.out.println("No grades were entered.");
        }
    }
}
