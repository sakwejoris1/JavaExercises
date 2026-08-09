import java.util.Scanner;

public class EstimateE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = input.nextInt();

        double e = 0.0;
        double factorial = 1.0;

        for (int i = 0; i < terms; i++) {
            if (i > 0) {
                factorial *= i;
            }
            e += 1.0 / factorial;
        }

        System.out.printf("Estimated value of e: %.10f%n", e);
    }
}
