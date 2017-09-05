package chapter5;

/**
 * Created by ola on 9/4/17.
 * Java. How to program P&H Deitel
 * Exercise 5.20
 * Calculating value of Pi
 */

import java.util.Scanner;

public class Ch520_ValueOfPi {

    public double calculatePi(int terms) {
        double pi = 4.0D;
        double c = 4.0D;
        int k = 3;
        boolean flag = false;

        for (int i = 0; i < terms; ++i) {
            if (i % 2 == 0) {
                pi -= c / (double) k;
            } else {
                pi += c / (double) k;
            }
            k += 2;
            double check = pi * 100000.0D;
            if (!flag && (int) check == 314159) {
                System.out.println("term to estimate 3.14159 = " + i);
                flag = true;
            }
        }
        return pi;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of terms to use for estimating Pi number:");
        int terms = s.nextInt();

        Ch520_ValueOfPi p = new Ch520_ValueOfPi();
        System.out.println(p.calculatePi(terms));
    }
}
