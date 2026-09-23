// Exercise 17.11 - the Invoice class
// A simple class with four properties: PartNumber, PartDescription,
// Quantity and Price, plus a helper method that calculates the total
// value of the invoice (Quantity * Price).
public class Invoice {
    private int partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(int partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // The total dollar value of this invoice
    public double getInvoiceValue() {
        return quantity * price;
    }

    public String toString() {
        return String.format("Part %-3d %-20s Qty: %-4d Price: $%-8.2f Value: $%.2f",
            partNumber, partDescription, quantity, price, getInvoiceValue());
    }
}
