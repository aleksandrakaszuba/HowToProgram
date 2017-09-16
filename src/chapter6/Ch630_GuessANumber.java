package chapter6;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by ola on 9/10/17.
 * Java. How to program P&H Deitel
 * Exercise 6.30
 * Number guessing game. (Binary search like)
 */
public class Ch630_GuessANumber {
    Random r = new Random();

    private int generateNumber() {
        return 1 + r.nextInt(1000);
    }

    public void play() {
        Scanner s = new Scanner(System.in);
        int num = generateNumber();
        int guess;
        System.out.println("Guess a number 1-1000:");
        do {
            guess = s.nextInt();
            if (guess > num) {
                System.out.println("Too high");
            } else if (guess < num) {
                System.out.println("Too low");
            }
            System.out.println("Try again:");
        } while (guess != num);
        System.out.println("Bingo! you guessed it");
    }

    public static void main(String[] args) {
        Ch630_GuessANumber g = new Ch630_GuessANumber();
        g.play();
        System.out.println("Goodbye");
    }
}
