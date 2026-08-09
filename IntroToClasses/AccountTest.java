import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("account1 balance: $%.2f%n", account1.getBalance());
        System.out.printf("account2 balance: $%.2f%n", account2.getBalance());

        Scanner input = new Scanner(System.in);
        double depositAmount;

        System.out.print("\nEnter deposit amount for account1: ");
        depositAmount = input.nextDouble();
        System.out.printf("adding %.2f to account1 balance%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("account1 balance: $%.2f%n", account1.getBalance());
        System.out.printf("account2 balance: $%.2f%n", account2.getBalance());

        System.out.print("\nEnter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("adding %.2f to account2 balance%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("account1 balance: $%.2f%n", account1.getBalance());
        System.out.printf("account2 balance: $%.2f%n", account2.getBalance());

        System.out.print("\nEnter withdrawal amount for account1: ");
        double withdrawAmount = input.nextDouble();
        account1.withdraw(withdrawAmount);

        System.out.print("\nEnter withdrawal amount for account2: ");
        withdrawAmount = input.nextDouble();
        account2.withdraw(withdrawAmount);

        System.out.printf("%naccount1 balance: $%.2f%n", account1.getBalance());
        System.out.printf("account2 balance: $%.2f%n", account2.getBalance());
    }
}
