package chapter6;

import java.util.Scanner;

/**
 * Created by ola on 9/10/17.
 * Java. How to program P&H Deitel
 * Exercise 6.21
 * Separating digits of an int (ex. 1234 to 1  2  3  4)
 */
public class Ch621_SeparatingDigits {

    private int integerOfQuaotient(int a, int b) {
        return a / b;
    }

    private int integerReminder(int a, int b) {
        return a % b;
    }

    public void displayDigits(int num) {
        int digit;
        int temp = 0;
        while (num > 0) {
            digit = integerReminder(num, 10);
            temp = temp * 10 + digit;
            System.out.println(temp);
            num = integerOfQuaotient(num, 10);
        }
        while (temp > 0) {

            if (temp < 10) {
                System.out.print(integerReminder(temp, 10));
            } else {
                System.out.print(integerReminder(temp, 10) + "  ");
            }
            temp = integerOfQuaotient(temp, 10);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ch621_SeparatingDigits sep = new Ch621_SeparatingDigits();
        int num;
        do {
            System.out.println("Enter integer num:");
            num = s.nextInt();
        } while (num < 0 & num > 9999);
        sep.displayDigits(num);

    }
}
