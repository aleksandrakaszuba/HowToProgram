package chapter6;

import java.util.Scanner;

/**
 * Created by ola on 9/10/17.
 * Java. How to program P&H Deitel
 * Exercise 6.27
 * Looks for a greatest common dividers of 2 integers
 */
public class Ch627_GreatestCommonDiviser {

    public static int gcd(int num1, int num2) {
        int r;
        while (num2 > 0) {
            System.out.println("num 1: " + num1 + " num 2: " + num2);
            r = num2;
            num2 = num1 % num2;
            num1 = r;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = s.nextInt();
        System.out.println("Enter second number");
        int num2 = s.nextInt();
        System.out.printf("GCD for %d and %d is: %d \n", num1, num2, gcd(num1, num2));
    }
}
