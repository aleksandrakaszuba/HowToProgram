package chapter6;

import java.util.Scanner;

/**
 * Created by ola on 9/8/17.
 * Java. How to program P&H Deitel
 * Exercise 6.8
 * Parking fees calculator
 */

public class Ch68_ParkingCharges {

    //in dollars
    double minFee = 2;
    double maxFee = 10;
    double feePerHour = 0.5;
    double totalCharges = 0;

    //in minutes
    int minTime = 3 * 60;
    int cutOffTime = 10 * 60;
    int dayTimeMax = 24 * 60;

    public double calaculateCharges(int days, int hours, int minutes) {
        double feeToPay = 0;
        int daysToadd = (int) Math.floor((hours + minutes / 60) / 24);
        int basetime = (hours * 60 + minutes) < 24 * 60 ? (hours * 60 + minutes) : (hours * 60 + minutes) - daysToadd * 24 * 60;
        days = days + daysToadd;
        if (basetime <= 0) {
            feeToPay = days * maxFee;
        } else {
            if (basetime < minTime) {
                feeToPay = (days * maxFee) + minFee;
            } else if (basetime >= minTime & basetime < cutOffTime) {
                feeToPay = (days * maxFee) + minFee + Math.ceil(((double) basetime - minTime) / 60) * feePerHour;
            } else {
                feeToPay = days * maxFee + maxFee;
            }
        }
        return feeToPay;
    }

    public double getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCharges(double totalCharges) {
        this.totalCharges = totalCharges;
    }

    public void totalCharges(double fee) {
        setTotalCharges(getTotalCharges() + fee);
        System.out.println("Total charges for clients: " + getTotalCharges());
    }

    public static void main(String[] args) {
        char nextCustomer;
        Scanner s = new Scanner(System.in);
        Ch68_ParkingCharges client = new Ch68_ParkingCharges();

        System.out.println("Add customer? y/n");
        nextCustomer = s.next().charAt(0);

        while (nextCustomer == 'y') {
            System.out.println("Days:");
            int days = s.nextInt();
            System.out.println("Hours:");
            int hours = s.nextInt();
            System.out.println("Minutes:");
            int minutes = s.nextInt();
            System.out.printf("Charges: %.2f\n", client.calaculateCharges(days, hours, minutes));
            client.totalCharges(client.calaculateCharges(days, hours, minutes));
            System.out.println("Add customer? y/n");
            nextCustomer = s.next().charAt(0);

        }

        System.out.println("Goodbye");

    }


}
