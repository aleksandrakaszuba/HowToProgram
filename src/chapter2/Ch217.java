package chapter2;


import java.util.Scanner;

/**
 * Created by ola on 8/21/17.
 */
public class Ch217 {
    Ch217() {
        int x = 0;
        int y = 0;
        int z = 0;
        int avarage = 0;
        int min = 0;
        int max = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        x = s.nextInt();
        System.out.println("Enter a number:");
        y = s.nextInt();
        System.out.println("Enter a number:");
        z = s.nextInt();


        System.out.printf("Sum is %d \n", x + y + z);
        System.out.printf("Avarage is %d \n", (x + y + z) / 3);

        if (x >= y) {
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }
        if (z >= max) {
            max = z;
        }
        if (z <= min) {
            min = z;
        }
        System.out.printf("Largest is %d \n", max);
        System.out.printf("Smallest is %d \n", min);

    }
}