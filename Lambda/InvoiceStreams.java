// Exercise 17.11 (Manipulating a Stream)
// NOTE: Fig. 17.20 (the exact sample invoice data) wasn't provided, so this
// uses reasonable sample data of the same shape (part number, description,
// quantity, price) to demonstrate each requested stream operation.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceStreams {
    public static void main(String[] args) {
        Invoice[] invoices = {
            new Invoice(83, "Electric sander", 7, 57.98),
            new Invoice(24, "Power saw", 18, 99.99),
            new Invoice(7, "Sledge hammer", 11, 21.50),
            new Invoice(77, "Hammer", 76, 11.99),
            new Invoice(39, "Jig saw", 3, 79.50)
        };

        // (a) Sort by PartDescription
        System.out.println("(a) Sorted by part description:");
        Arrays.stream(invoices)
            .sorted(Comparator.comparing(Invoice::getPartDescription))
            .forEach(System.out::println);

        // (b) Sort by Price
        System.out.println("\n(b) Sorted by price:");
        Arrays.stream(invoices)
            .sorted(Comparator.comparingDouble(Invoice::getPrice))
            .forEach(System.out::println);

        // (c) Map to PartDescription + Quantity, sorted by Quantity
        System.out.println("\n(c) Description and quantity, sorted by quantity:");
        Arrays.stream(invoices)
            .sorted(Comparator.comparingInt(Invoice::getQuantity))
            .map(invoice -> invoice.getPartDescription() + ": " + invoice.getQuantity())
            .forEach(System.out::println);

        // (d) Map to PartDescription + invoice value (Quantity * Price), ordered by value
        System.out.println("\n(d) Description and invoice value, sorted by value:");
        Arrays.stream(invoices)
            .sorted(Comparator.comparingDouble(Invoice::getInvoiceValue))
            .map(invoice -> invoice.getPartDescription() + ": $" + String.format("%.2f", invoice.getInvoiceValue()))
            .forEach(System.out::println);

        // (e) Same as (d), but only invoice values between $200 and $500
        System.out.println("\n(e) Description and invoice value between $200 and $500:");
        List<String> filtered = Arrays.stream(invoices)
            .filter(invoice -> invoice.getInvoiceValue() >= 200 && invoice.getInvoiceValue() <= 500)
            .sorted(Comparator.comparingDouble(Invoice::getInvoiceValue))
            .map(invoice -> invoice.getPartDescription() + ": $" + String.format("%.2f", invoice.getInvoiceValue()))
            .collect(Collectors.toList());
        filtered.forEach(System.out::println);
    }
}
