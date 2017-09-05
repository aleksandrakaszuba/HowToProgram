package chapter5;

/**
 * Created by ola on 9/3/17.
 * Java. How to program P&H Deitel
 * Exercise 5.18
 * Modified compound interest program
 * Displays amounts earned for different interest rates in the same year
 */

public class Ch518_ModCompoundIntrest {
    /*
     A = P * (1 + r/n)^(nt)
     Where:
     A = the future value of the investment/loan, including interest
     P = the principal investment amount (the initial deposit or loan amount)
     r = the annual interest rate (decimal)
     n = the number of times that interest is compounded per year
     t = the number of years the money is invested or borrowed for
 */
    public static void main(String[] args) {

        double amount;
        double principal = 1000;
        double rate = 0;
        int years = 10;

        System.out.printf("%4s %10s %10s\n", "Year", "Interest", "Amount");

        for (int i = 1; i <= years; i++) {
            for (int j = 5; j <= 9; j++) {
                rate = j;
                amount = principal * Math.pow(1 + rate / 100, 1 * i);
                if (j == 5) {
                    System.out.printf("%4d %10.2f %,10.2f\n", i, rate, amount);
                } else {
                    System.out.printf("%4s %10.2f %,10.2f\n", " ", rate, amount);

                }
            }
        }
    }
}