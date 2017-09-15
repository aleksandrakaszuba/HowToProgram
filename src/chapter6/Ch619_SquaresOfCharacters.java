package chapter6;

import java.util.Scanner;

/**
 * Created by ola on 9/10/17.
 * Java. How to program P&H Deitel
 * Exercise 6.19
 * Prints a square on the screen out of a char chosen by user
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
        char fill = s.next().charAt(0);
        displaySquare(side, fill);


    }
}
