package chapter6;

import java.util.Scanner;

/**
 * Created by ola on 9/10/17.
 * Java. How to program P&H Deitel
 * Exercise 6.22
 * Temp conversions
 */
public class Ch622_TempConversion {

    public static double convertToCelsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double convertToFahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter temperature:");
        double temp = s.nextDouble();
        System.out.printf("Temp entered: %.2f, Fahrenheit: %.2f, Celsius: %.2f", temp, convertToFahrenheit(temp), convertToCelsius(temp));

    }
}
