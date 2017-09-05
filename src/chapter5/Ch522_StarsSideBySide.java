package chapter5;

/**
 * Created by ola on 9/4/17.
 * Java. How to program P&H Deitel
 * Exercise 5.22
 * Modified triangle printing program. Prints right triangles (made of stars/signs) next to each other
 */

public class Ch522_StarsSideBySide {
    public Ch522_StarsSideBySide() {
    }

    public void stars(int num) {
        for (int i = 0; i < num; ++i) {
            int j;
            for (j = 0; j < num; ++j) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (j = 0; j < num; ++j) {
                if (j < num - i && j >= 0) {
                    System.out.print("-");
                } else {
                    System.out.print(" ");
                }
            }

            for (j = 0; j < num; ++j) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (j = 1; j <= num; ++j) {
                if (j < num - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Ch522_StarsSideBySide stars = new Ch522_StarsSideBySide();
        int side = 10;
        stars.stars(side);
    }
}
