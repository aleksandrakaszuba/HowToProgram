package chapter4;

import java.util.Scanner;

/**
 * Created by ola on 8/31/17.
 */
public class Ch429_SquareOfAsterix {

    public void drawRecatangle(int width, int height) {

        for (int j = 0; j < height; j++) {
            if (j == 0 || j == height - 1) {
                for (int i = 0; i < width; i++) {
                    System.out.print("*");
                }
            } else {
                for (int i = 0; i < width; i++) {
                    if (i == 0 || i == width - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");

        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int width;
        int height;
        Ch429_SquareOfAsterix rectangle = new Ch429_SquareOfAsterix();
        System.out.print("Rectangle's width:1-20\n");
        width = s.nextInt();
        while (width < 1 || width > 20) {
            System.out.print("Rectangle's width should be 1-20:\n");
            width = s.nextInt();
        }

        System.out.print("Rectangle's height 1-20:\n");
        height = s.nextInt();
        while (height < 1 || height > 20) {
            System.out.print("Rectangle's height should be 1-20:\n");
            height = s.nextInt();
        }
        rectangle.drawRecatangle(width, height);

    }
}