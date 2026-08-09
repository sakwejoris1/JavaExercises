public class Factorials {
    public static void main(String[] args) {
        System.out.printf("%-5s%s%n", "n", "n!");

        long factorial = 1;
        for (int n = 1; n <= 20; n++) {
            factorial *= n;
            System.out.printf("%-5d%d%n", n, factorial);
        }
    }
}

/*
 * Difficulty calculating 100!:
 * 100! is an enormous number (158 digits) that far exceeds the range of
 * type long (max ~9.2 x 10^18). Computing it accurately would require an
 * arbitrary-precision numeric type such as java.math.BigInteger.
 */
