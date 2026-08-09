import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalMiles = 0;
        int totalGallons = 0;

        System.out.print("Enter the miles used (-1 to end): ");
        int miles = input.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons: ");
            int gallons = input.nextInt();

            double mpg = (double) miles / gallons;
            System.out.printf("The miles/gallon for this tank was %.2f%n", mpg);

            totalMiles += miles;
            totalGallons += gallons;

            System.out.print("Enter the miles used (-1 to end): ");
            miles = input.nextInt();
        }

        if (totalGallons != 0) {
            double combinedMpg = (double) totalMiles / totalGallons;
            System.out.printf("%nThe overall average miles/gallon was %.2f%n", combinedMpg);
        }
    }
}
