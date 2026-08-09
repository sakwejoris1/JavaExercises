public class CompoundInterestPennies {
    public static void main(String[] args) {
        long principal = 100000; // $1000.00 in pennies
        double rate = 0.05;

        System.out.printf("%-10s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; year++) {
            long amount = Math.round(principal * Math.pow(1.0 + rate, year));

            long dollars = amount / 100;
            long cents = amount % 100;

            System.out.printf("%-10d%15d.%02d%n", year, dollars, cents);
        }
    }
}
