package chapter6;

import java.util.Scanner;

/**
 * Created by ola on 9/10/17.
 */
public class Ch619_SquaresOfCharacters {

    public static void displaySquare(int side, char fillCharcter) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(fillCharcter);
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter side of square:");
        int side = s.nextInt();
        System.out.println("Enter temperature:");
        char fill = s.next().charAt(0);
        displaySquare(side, fill);


    }
}
