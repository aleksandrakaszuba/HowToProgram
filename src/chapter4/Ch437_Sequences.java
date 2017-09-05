/**
 * Created by ola on 9/1/17.
 */
package chapter4;

import java.util.Scanner;

public class Ch437_Sequences {
    public int factorial(int number) {
        int n = number;
        int k = 0;
        int factorial = 1;
        while (n - k > 0) {
            factorial *= n - k;
            k++;
        }
        return factorial;
    }

    //calculates value of e
    public double calculateE(int numberOfTerms) {
        double e = 1;
        int k = 1;
        while (k <= numberOfTerms) {
            e += (double) 1 / factorial(k);
            k++;
        }
        return e;
    }

    ///calculates value of e^x
    public double calculateEtoX(int numberOfTerms, int x) {
        double e = 1;
        int k = 1;
        while (k <= numberOfTerms) {
            e += (double) Math.pow(x, k) / factorial(k);
            k++;
        }
        return e;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ch437_Sequences f = new Ch437_Sequences();
        System.out.print("Enter a number:\n");
        int number = s.nextInt();
        System.out.print("Enter number of terms for e calculation:\n");
        int numberOfTerms = s.nextInt();
        System.out.print("Enter x for e^x calculation:\n");
        int x = s.nextInt();
        System.out.print(f.factorial(number) + "\n");
        System.out.print(f.calculateE(numberOfTerms) + "\n");
        System.out.print(f.calculateEtoX(numberOfTerms, x) + "\n");
    }
}