package chapter5;

/**
 * Created by ola on 9/4/17.
 * Java. How to program P&H Deitel
 * Exercise 5.17
 */

import java.util.Scanner;

public class Ch517_CalculatingSales {
    public Ch517_CalculatingSales() {
    }

    private double addProduct(int productNumber) {
        double price = 0.0D;
        switch (productNumber) {
            case 1:
                price = 2.98D;
                break;
            case 2:
                price = 4.5D;
                break;
            case 3:
                price = 9.98D;
                break;
            case 4:
                price = 4.49D;
                break;
            case 5:
                price = 6.87D;
        }

        return price;
    }

    public double calculateTotalSales() {
        double total = 0.0D;
        Scanner s = new Scanner(System.in);

        int product;
        do {
            System.out.println("Enter product number (1-5) / -1 to exit:");
            product = s.nextInt();
            total += this.addProduct(product);
        } while (product != -1);

        return total;
    }

    public static void main(String[] args) {
        Ch517_CalculatingSales sales = new Ch517_CalculatingSales();
        System.out.printf("Total sales: $%.2f ", sales.calculateTotalSales());
    }
}
