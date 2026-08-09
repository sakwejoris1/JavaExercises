import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("\nEmployee #" + i);

            System.out.print("Enter hours worked: ");
            double hours = input.nextDouble();

            System.out.print("Enter hourly rate: ");
            double rate = input.nextDouble();

            double grossPay;
            if (hours > 40) {
                grossPay = (40 * rate) + ((hours - 40) * rate * 1.5);
            } else {
                grossPay = hours * rate;
            }

            System.out.printf("Gross pay: $%.2f%n", grossPay);
        }
    }
}
