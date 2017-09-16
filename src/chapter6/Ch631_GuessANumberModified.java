package chapter6;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by ola on 9/10/17.
 * Java. How to program P&H Deitel
 * Exercise 6.31
 * Number guessing game with counter. (Binary search like)
 */
public class Ch631_GuessANumberModified {

    Random r = new Random();

    private int generateNumber() {
        return 1 + r.nextInt(1000);
    }

    public void play() {
        Scanner s = new Scanner(System.in);
        int num = generateNumber();
        int guess;
        int count = 0;
        System.out.println("Guess a number 1-1000:");
        do {
            guess = s.nextInt();

            if (guess > num) {
                System.out.println("Too high");
                System.out.println("Try again:");

            } else {
                System.out.println("Too low");
                System.out.println("Try again:");
            }
            count++;
        } while (guess != num);
        System.out.println("Bingo! you guessed it");

        if (count < 10) {
            System.out.printf("%d guesses. Either you know a secret or you got lucky!\n", count);
        } else if (count == 10) {
            System.out.printf("%d guesses. Aha! You know the secret!\n", count);
        } else {
            System.out.printf("%d guesses. You should be able to do better!\n", count);
        }
    }

    public static void main(String[] args) {
        Ch631_GuessANumberModified g = new Ch631_GuessANumberModified();
        g.play();
        System.out.println("Goodbye");
    }
}
