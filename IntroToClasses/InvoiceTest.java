public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("00001", "Hammer", 3, 12.99);
        Invoice invoice2 = new Invoice("00002", "Screwdriver Set", -5, 25.50);
        Invoice invoice3 = new Invoice("00003", "Nail Box", 10, -3.75);

        System.out.printf("%s | %s | Qty: %d | Price: $%.2f | Amount: $%.2f%n",
            invoice1.getPartNumber(), invoice1.getPartDescription(),
            invoice1.getQuantity(), invoice1.getPricePerItem(), invoice1.getInvoiceAmount());

        System.out.printf("%s | %s | Qty: %d | Price: $%.2f | Amount: $%.2f%n",
            invoice2.getPartNumber(), invoice2.getPartDescription(),
            invoice2.getQuantity(), invoice2.getPricePerItem(), invoice2.getInvoiceAmount());

        System.out.printf("%s | %s | Qty: %d | Price: $%.2f | Amount: $%.2f%n",
            invoice3.getPartNumber(), invoice3.getPartDescription(),
            invoice3.getQuantity(), invoice3.getPricePerItem(), invoice3.getInvoiceAmount());
    }
}
