package chapter5;

import java.util.Scanner;

public class Ch511_SmallestValue {
    public Ch511_SmallestValue() {
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        new Ch511_SmallestValue();
        int i = 0;
        System.out.println("Enter number of numbers to compare:");
        int count = s.nextInt();
        System.out.println("Enter number to compare:");

        int min;
        for (min = s.nextInt(); i < count; ++i) {
            System.out.println("Enter number to compare:");
            int number = s.nextInt();
            if (min > number) {
                min = number;
            }
        }

        System.out.printf("The min is: %d", new Object[]{Integer.valueOf(min)});
    }
}
