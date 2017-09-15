package chapter6;

import java.util.Scanner;

/**
 * Created by ola on 9/10/17.
 * Java. How to program P&H Deitel
 * Exercise 6.25
 * Is a number prime?
 */
public class Ch625_PrimeNumbers {

    public static boolean primeNumbers(int num) {
        boolean prime = true;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0 & prime != false) {
                prime = false;
                //  System.out.println(i);
            }
        }
        return prime;
    }

    public static boolean primeNumbersSquareRoot(int num) {
        boolean prime = true;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0 & prime != false) {
                prime = false;
                // System.out.println(i);
            }
        }
        return prime;
    }

    public static void printPrimes() {
        for (int i = 1; i <= 10000; i++) {
            System.out.printf("%d is prime: %b \n", i, primeNumbers(i));
            System.out.printf("%d is prime: %b \n", i, primeNumbersSquareRoot(i));
            if (primeNumbers(i) != primeNumbersSquareRoot(i)) {
                System.out.println("WRONG!");
            }
            System.out.println("-----------");
        }
    }

    public static void isPrime() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int num = s.nextInt();
        System.out.printf("%d is prime: %b \n", num, primeNumbers(num));
        System.out.printf("%d is prime: %b \n", num, primeNumbersSquareRoot(num));
    }

    public static void main(String[] args) {
        //isPrime();
        printPrimes();
    }
}
