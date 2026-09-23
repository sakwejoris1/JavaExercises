// Exercise 16.19 (Prime Numbers and Prime Factors)
// Asks the user for a whole number. If it's prime, says so. If not, finds
// its UNIQUE prime factors (using a Set, so repeats like 3, 3, 3 only show
// up once) and prints them.
//
// Example: 54 = 2 x 3 x 3 x 3, so the unique prime factors printed are 2 and 3.
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int number = input.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
            Set<Integer> uniqueFactors = findPrimeFactors(number);
            System.out.println("Its unique prime factors are: " + uniqueFactors);
        }
    }

    // Checks whether "number" is prime (only divisible by 1 and itself)
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Finds every unique prime number that divides evenly into "number"
    private static Set<Integer> findPrimeFactors(int number) {
        // TreeSet keeps the factors sorted and automatically removes duplicates
        Set<Integer> factors = new TreeSet<>();

        int remaining = number;
        int divisor = 2;
        while (remaining > 1) {
            if (remaining % divisor == 0) {
                factors.add(divisor);
                remaining = remaining / divisor;
            } else {
                divisor++;
            }
        }

        return factors;
    }
}
