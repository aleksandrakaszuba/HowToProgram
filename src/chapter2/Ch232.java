package chapter2;

import java.util.Scanner;

/**
 * Created by ola on 8/22/17.
 * Negative positive and zero value
 */
public class Ch232 {
    void countNumbers() {
        int neg = 0;
        int pos = 0;
        int zeros = 0;
        int current = 0;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter number: \n");
            current = s.nextInt();
            if (current > 0) {
                pos++;
            }
            if (current < 0) {
                neg++;
            }
            if (current == 0) {
                zeros++;
            }
        }
        System.out.printf("Neg: %d, Pos: %d, Zeros: %d\n", neg, pos, zeros);
    }

    public static void main(String[] args) {
        Ch232 ch232 = new Ch232();
        ch232.countNumbers();
    }
}