import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalSales = 0.0;
        int itemNumber;

        System.out.print("Enter item number sold (-1 to end): ");
        itemNumber = input.nextInt();

        while (itemNumber != -1) {
            double value;

            switch (itemNumber) {
                case 1: value = 239.99; break;
                case 2: value = 129.75; break;
                case 3: value = 99.95; break;
                case 4: value = 350.89; break;
                default:
                    System.out.println("Invalid item number.");
                    value = 0.0;
            }

            totalSales += value;

            System.out.print("Enter item number sold (-1 to end): ");
            itemNumber = input.nextInt();
        }

        double earnings = 200 + (0.09 * totalSales);
        System.out.printf("%nSalesperson's earnings: $%.2f%n", earnings);
    }
}
