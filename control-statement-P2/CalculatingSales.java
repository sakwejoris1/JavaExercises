import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalValue = 0.0;

        System.out.print("Enter product number (-1 to end): ");
        int productNumber = input.nextInt();

        while (productNumber != -1) {
            System.out.print("Enter quantity sold: ");
            int quantity = input.nextInt();

            double price;
            switch (productNumber) {
                case 1: price = 2.98; break;
                case 2: price = 4.50; break;
                case 3: price = 9.98; break;
                case 4: price = 4.49; break;
                case 5: price = 6.87; break;
                default:
                    System.out.println("Invalid product number.");
                    price = 0.0;
            }

            totalValue += price * quantity;

            System.out.print("\nEnter product number (-1 to end): ");
            productNumber = input.nextInt();
        }

        System.out.printf("%nTotal retail value of all products sold: $%.2f%n", totalValue);
    }
}
