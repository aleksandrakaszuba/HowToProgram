package chapter4;

import java.util.Scanner;

/**
 * Created by ola on 9/1/17.
 */
public class Ch435_Triangle {
    public String isTriangle(double a, double b, double c) {
        if (a + b > c & a + c > b & b + c > a) {
            return "These side can create a triangle";
        } else {
            return "These side can't create a triangle";
        }

    }

    public String isRightTriangle(double a, double b, double c) {
        if (a * a + b * b == c * c || c * c + b * b == a * a || a * a + c * c == b * b) {
            return "These sides can create a right triangle \n";
        } else {
            return "These sides can't create a right triangle \n";
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ch435_Triangle t = new Ch435_Triangle();
        System.out.print("Enter triangles 1st side length:\n");
        double a = s.nextInt();
        System.out.print("Enter triangles 2st side length:\n");
        double b = s.nextInt();
        System.out.print("Enter triangles 3rd side length:\n");
        double c = s.nextInt();
        System.out.print(t.isTriangle(a, b, c) + "\n");
        System.out.print(t.isRightTriangle(a, b, c));
    }
}