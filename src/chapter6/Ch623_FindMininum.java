package chapter6;

import java.util.Scanner;

/**
 * Created by ola on 9/10/17.
 * Java. How to program P&H Deitel
 * Exercise 6.23
 * Finding a minimum amongst 3 floating numbers
 */
public class Ch623_FindMininum {
    public static double minimum3(double a, double b, double c) {
        double min = Math.min(a, b);
        min = Math.min(min, c);
        return min;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter num a: \n");
        double a = s.nextDouble();
        System.out.printf("Enter num b: \n");
        double b = s.nextDouble();
        System.out.printf("Enter num c: \n");
        double c = s.nextDouble();

        System.out.printf("Min %.2f: \n", minimum3(a, b, c));

    }
}
