import java.util.Scanner;

/**
 * Created by ola on 9/3/17.
 */
public class Ch517_CalculatingSales {

    private double addProduct(int productNumber){
        double price = 0;

        switch (productNumber) {
            case 1:
                price = 2.98;
                break;
            case 2:
                price = 4.50;
                break;
            case 3:
                price = 9.98;
                break;
            case 4:
                price = 4.49;
                break;
            case 5:
                price = 6.87;
                break;
        }
        return price;
    }
    public double calculateTotalSales(){
        double total = 0;
        int product;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Enter product number (1-5) / -1 to exit:");
            product = s.nextInt();
            total += addProduct(product);
        }while (product!=-1);
        return total;
    }

    public static void main(String[] args) {
        Ch517_CalculatingSales sales = new Ch517_CalculatingSales();
        System.out.printf("Total sales: $%.2f ", sales.calculateTotalSales());
    }
}
