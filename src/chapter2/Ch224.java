package chapter2;


import java.util.Scanner;

/**
 * Created by ola on 8/22/17.
 * Finds max and min integer from numbers entered by user
 */
public class Ch224 {

    Ch224() {

    }

    void findMinMax(int integers) {
        Scanner s = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int a[] = new int[integers];
        for (int i = 0; i < integers; i++) {
            System.out.println("Enter a number:");
            a[i] = s.nextInt();
            if (i == 0) {
                min = a[i];
                max = a[i];
            } else {
                if (min > a[i]) {
                    min = a[i];
                }
                if (max < a[i]) {
                    max = a[i];
                }
            }

        }
        System.out.printf("Max is %d, Min is %d\n", max, min);
    }

    public static void main(String[] args) {
        Ch224 o = new Ch224();
        o.findMinMax(5);
    }


}