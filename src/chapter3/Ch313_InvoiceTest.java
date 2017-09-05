package chapter3;

/**
 * Created by ola on 8/25/17.
 */
class Ch313_InvoiceTest {
    public static void main(String[] args) {
        Ch313_Invoice invoice = new Ch313_Invoice("0000", "Part", 0, 0);
        System.out.print("Invoice amount: " + invoice.getInvoiceAmount(10, 5));
    }
}