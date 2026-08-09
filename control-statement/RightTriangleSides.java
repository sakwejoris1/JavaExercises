import java.util.Scanner;

public class RightTriangleSides {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        int a = input.nextInt();
        System.out.print("Enter side 2: ");
        int b = input.nextInt();
        System.out.print("Enter side 3: ");
        int c = input.nextInt();

        int hypotenuseSquared;
        int legSumSquared;

        // The hypotenuse is the largest of the three sides
        if (a >= b && a >= c) {
            hypotenuseSquared = a * a;
            legSumSquared = (b * b) + (c * c);
        } else if (b >= a && b >= c) {
            hypotenuseSquared = b * b;
            legSumSquared = (a * a) + (c * c);
        } else {
            hypotenuseSquared = c * c;
            legSumSquared = (a * a) + (b * b);
        }

        if (hypotenuseSquared == legSumSquared) {
            System.out.println("These sides could form a right triangle.");
        } else {
            System.out.println("These sides could NOT form a right triangle.");
        }
    }
}
