package chapter6;

import java.util.Scanner;

/**
 * Created by ola on 9/10/17.
 * Java. How to program P&H Deitel
 * Exercise 6.32
 * Distance between (x1,y1) and (x2,x2)
 */
public class Ch632_DistanceBetweenPoints {
    public double distanceBetweenPoints(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    public static void main(String[] args) {
        Ch632_DistanceBetweenPoints d = new Ch632_DistanceBetweenPoints();
        Scanner s = new Scanner(System.in);

        double x1, y1;
        double x2, y2;

        System.out.println("Enter first point (x1,y1)");
        System.out.println("x1:");
        x1 = s.nextDouble();
        System.out.println("y1:");
        y1 = s.nextDouble();

        System.out.println("Enter first point (x2,y2)");
        System.out.println("x2:");
        x2 = s.nextDouble();
        System.out.println("y2:");
        y2 = s.nextDouble();
        System.out.printf("Distance %.2f", d.distanceBetweenPoints(x1, y1, x2, y2));
    }
}
