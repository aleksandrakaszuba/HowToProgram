package chapter2;

import java.util.Scanner;

/**
 * Created by ola on 8/21/17.
 * How it works P&H Deitel
 * Exercise 2.16
 */
public class Ch216 {

    Ch216() {
        int x = 0;
        int y = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        x = s.nextInt();
        System.out.println("Enter a number:");
        y = s.nextInt();
        if (x > y) {
            System.out.printf("%d is larger than %d \n", x, y);
        } else if (x == y) {
            System.out.printf("%d is equal to %d \n", x, y);
        } else {
            System.out.printf("%d is larger than %d \n", y, x);

        }


    }
}