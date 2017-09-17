package chapter6;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by ola on 9/16/17.
 * Java. How to program P&H Deitel
 * Exercise 6.35
 * Modified version CAI - Program helping students to learn mathematical problems
 */

public class Ch635_CAI {
    Random r = new Random();
    Scanner s = new Scanner(System.in);


    private void newQuestion() {
        int a = r.nextInt(10);
        int b = r.nextInt(10);
        int result = a * b;
        int answer;
        System.out.printf("How much is %d times %d\n", a, b);
        do {
            answer = s.nextInt();
            if (answer != result) {
                System.out.println("No. Please try again:");
            }
        } while (answer != result);
        System.out.printf("Very good!\n");

    }

    public void play() {
        char nextGame;
        do {
            newQuestion();
            System.out.println("Play again? (y/n):");
            nextGame = s.next().charAt(0);
        } while (nextGame == 'y');
    }

    public static void main(String[] args) {
        Ch635_CAI d = new Ch635_CAI();
        d.play();
        System.out.println("Goodbye!");
    }
}
