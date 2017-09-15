package chapter6;

import java.util.Scanner;

/**
 * Created by ola on 9/4/17.
 * Java. How to program P&H Deitel
 * Exercise 6.6
 * Calculates volume of the sphere after user enters radius
 */

public class Ch66_Sphere {

    public static double calculateSphere(int radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter radius of a sphere");
        int radius = s.nextInt();
        System.out.println("Volume: " + calculateSphere(radius));
    }
}
