package chapter5; /**
 * Created by ola on 9/4/17.
 * Java. How to program P&H Deitel
 * Exercise 5.24
 * Prints a diamond shape with astrix
 */

import java.util.Scanner;

public class Ch525_DiamondPrinting {
    public Ch525_DiamondPrinting() {
    }

    public void diamond(int num) {
        int i;
        int j;
        for (i = 0; i <= num / 2; ++i) {
            for (j = 1; j <= num / 2; ++j) {
                if (j <= num / 2 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            for (j = 0; j <= num / 2; ++j) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (i = 0; i < num / 2; ++i) {
            for (j = 0; j < num / 2; ++j) {
                if (j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (j = 0; j < num / 2; ++j) {
                if (j < num / 2 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ch525_DiamondPrinting stars = new Ch525_DiamondPrinting();

        int num;
        do {
            do {
                System.out.println("Enter size of a diamond (odd number):");
                num = s.nextInt();
            } while (num < 1);
        } while (num > 19 || num % 2 == 0);

        stars.diamond(num);
    }
}
