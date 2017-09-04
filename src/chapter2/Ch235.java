package chapter2;

import java.util.Scanner;

/**
 * Created by ola on 8/22/17.
 * Car pool Saving calculator
 */
public class Ch235 {
    void carpoolCalc() {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter miles per day:");
        double milesPerDay = s.nextInt();

        System.out.println("Enter parking per day:");
        double parkingPerDay = s.nextDouble();

        System.out.println("Enter tolls per day:");
        double tollsPerDay = s.nextDouble();

        System.out.println("Enter cost per gallon of gas:");
        double costPerGallon = s.nextDouble();

        System.out.println("Enter avg consumption - gallons of gas per mile:");
        double milesPerGallon = s.nextDouble();

        double totalCostPerDay = (costPerGallon * milesPerDay) * milesPerGallon + parkingPerDay + tollsPerDay;

        System.out.printf("Total cost per day = %.2f$ \n", totalCostPerDay);

    }

    public static void main(String[] args) {
        Ch235 ch235 = new Ch235();
        ch235.carpoolCalc();
    }
}