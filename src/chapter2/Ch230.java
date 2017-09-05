package chapter2;

import java.util.Scanner;

/**
 * Created by ola on 8/22/17.
 */
public class Ch230 {
    void numbers() {
        Scanner s = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        System.out.println("Enter number:");
        int x = s.nextInt();

        int r;
        while (x > 0) {
            r = x % 10;
            x = x / 10;
            System.out.println(x);
            if (x == 0) {
                str.append(r);
            } else {
                str.append(r + "   ");
            }
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Ch230 ch230 = new Ch230();
        ch230.numbers();
    }
}