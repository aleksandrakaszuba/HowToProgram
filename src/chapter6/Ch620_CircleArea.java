package chapter6;

import java.util.Scanner;

/**
 * Created by ola on 9/10/17.
 * Java. How to program P&H Deitel
 * Exercise 6.20
 * Temp conversions
 */
public class Ch620_CircleArea {
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter side of square:");
        double radius = s.nextDouble();
        System.out.printf("Area: %.2f\n", circleArea(radius));

    }
}
