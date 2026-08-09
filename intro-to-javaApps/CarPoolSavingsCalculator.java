import java.util.Scanner;

public class CarPoolSavingsCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        double milesPerDay = input.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = input.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parkingFees = input.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tolls = input.nextDouble();

        // Calculate gallons used per day and the resulting gas cost
        double gallonsUsed = milesPerDay / milesPerGallon;
        double gasCost = gallonsUsed * costPerGallon;

        // Total daily driving cost
        double totalDailyCost = gasCost + parkingFees + tolls;

        System.out.printf("%nYour daily cost of driving to work is: $%.2f%n", totalDailyCost);
    }
}