import java.util.Scanner;

public class EstimateEToX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        double x = input.nextDouble();

        System.out.print("Enter number of terms: ");
        int terms = input.nextInt();

        double result = 0.0;
        double factorial = 1.0;
        double xPower = 1.0;

        for (int i = 0; i < terms; i++) {
            if (i > 0) {
                factorial *= i;
                xPower *= x;
            }
            result += xPower / factorial;
        }

        System.out.printf("e^%.2f is approximately: %.10f%n", x, result);
    }
}
