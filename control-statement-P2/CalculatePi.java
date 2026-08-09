public class CalculatePi {
    public static void main(String[] args) {
        double pi = 0.0;
        double sign = 1.0;
        boolean found = false;

        for (int i = 1; i <= 200000; i += 2) {
            pi += sign * (4.0 / i);
            sign *= -1;

            if (!found) {
                String formatted = String.format("%.5f", pi);
                if (formatted.startsWith("3.14159")) {
                    System.out.println("First reaches 3.14159 after " +
                        ((i + 1) / 2) + " terms: " + formatted);
                    found = true;
                }
            }
        }

        System.out.printf("%nFinal value of pi after 200,000 terms: %.10f%n", pi);
    }
}
