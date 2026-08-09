public class CompoundInterestRates {
    public static void main(String[] args) {
        double principal = 1000.0;
        double[] rates = {0.05, 0.06, 0.07, 0.08, 0.09, 0.10};

        for (double rate : rates) {
            System.out.printf("%nInterest Rate: %.0f%%%n", rate * 100);
            System.out.printf("%-10s%20s%n", "Year", "Amount on deposit");

            for (int year = 1; year <= 10; year++) {
                double amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%-10d%,20.2f%n", year, amount);
            }
        }
    }
}
