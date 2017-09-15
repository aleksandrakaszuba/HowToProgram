package chapter6;

import java.util.Scanner;

/**
 * Created by ola on 9/10/17.
 * Java. How to program P&H Deitel
 * Exercise 6.26
 * Reversing digits in an integer (ex. 1234 -> 4321)
 */

public class Ch626_ReversingDigits {

    public static int reverseDigits(int num) {
        int digit;
        int reversedNumber = 0;
        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            reversedNumber = reversedNumber * 10 + digit;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer to reverse");
        int num = s.nextInt();
        System.out.printf("Num: %d, reversed num: %d", num, reverseDigits(num));

    }
}
