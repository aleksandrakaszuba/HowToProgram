package chapter2;

import java.util.Scanner;

/**
 * Created by ola on 8/22/17.
 * Is a first number a multiple of the second number
 */
public class Ch226 {
    Ch226() {

    }

    void multiple() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int x1 = s.nextInt();
        System.out.println("Enter number 2:");
        int x2 = s.nextInt();

        if ((x1 > x2 & x1 % x2 > 0) || (x1 < x2 & x2 % x1 > 0)) {
            System.out.printf("%d is not a multiple of %d", x1, x2);

        } else {
            System.out.printf("%d is a multiple of %d", x1, x2);

        }

    }

    public static void main(String[] args) {
        Ch226 ch226 = new Ch226();
        ch226.multiple();
    }
}