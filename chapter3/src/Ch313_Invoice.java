/**
 * Created by ola on 8/25/17.
 */
public class Ch313_Invoice {
    String partNumber;
    String partDesc;
    int quantity;
    int pricePerItem;

    Ch313_Invoice(String partNumber, String partDesc, int quantity, int pricePerItem){
        this.partDesc = partDesc;
        this.partNumber = partNumber;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDesc() {
        return partDesc;
    }

    public void setPartDesc(String partDesc) {
        this.partDesc = partDesc;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount(int quantity, int pricePerItem){
        quantity = (quantity<0)? 0 : quantity;
        pricePerItem = (pricePerItem<0)? 0 : pricePerItem;
        return quantity*pricePerItem;
    }
    public static  void main(String[] args){
        Ch313_Invoice invoice = new Ch313_Invoice("0000", "Part", 0, 0);
        System.out.print("Invoice amount: " + invoice.getInvoiceAmount(30, 5));
    }
}
