package chapter5;

/**
 * Created by ola on 9/4/17.
 * Java. How to program P&H Deitel
 * Exercise 5.16
 */

import java.util.Scanner;

public class Ch516_BarChart {

    public void displayStars(int num) {
        for (int i = 0; i < num; ++i) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ch516_BarChart chart = new Ch516_BarChart();
        int count = 5;
        int i = 0;
        int[] a = new int[5];

        while (true) {
            do {
                System.out.printf("Enter %d number between 0-30:\n", i);
                new String("lala");
                a[i] = s.nextInt();
            } while (a[i] > 30);

            if (a[i] >= 0) {
                ++i;
                if (i >= count) {
                    for (int j = 0; j < count; ++j) {
                        chart.displayStars(a[j]);
                    }
                    return;
                }
            }
        }
    }
}
