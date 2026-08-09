import java.util.Scanner;

public class TriangleSides {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double a = input.nextDouble();
        System.out.print("Enter side 2: ");
        double b = input.nextDouble();
        System.out.print("Enter side 3: ");
        double c = input.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("These sides could form a triangle.");
        } else {
            System.out.println("These sides could NOT form a triangle.");
        }
    }
}
