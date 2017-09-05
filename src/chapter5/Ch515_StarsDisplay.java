package chapter5;

/**
 * Created by ola on 9/4/17.
 * Java. How to program P&H Deitel
 * Exercise 5.15
 */

public class Ch515_StarsDisplay {

    public void stars1(int num) {
        for (int i = 0; i < num; ++i) {
            for (int j = 0; j < i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void stars2(int num) {
        int n = num;

        for (int i = 0; i < num; ++i) {
            for (int j = 0; j < n; ++j) {
                if (j < num - i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    public void stars3(int num) {
        for (int i = 0; i < num; ++i) {
            for (int j = 0; j < num; ++j) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public void stars4(int num) {
        for (int i = 1; i <= num; ++i) {
            for (int j = 1; j <= num; ++j) {
                if (j <= num - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Ch515_StarsDisplay stars = new Ch515_StarsDisplay();
        stars.stars1(10);
        stars.stars2(10);
        stars.stars3(10);
        stars.stars4(10);
    }
}
