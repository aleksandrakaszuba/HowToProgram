package chapter6;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by ola on 9/16/17.
 * Java. How to program P&H Deitel
 * Exercise 6.36
 * Modified version CAI - Added various messages in response to user answers
 */
public class Ch636_CAIReducingStudentsFatigue {
    Random r = new Random();
    Scanner s = new Scanner(System.in);


    private String positiveResponse() {
        int randomNum = r.nextInt(4);
        String response = new String();
        switch (randomNum) {
            case 0:
                response = "Very Good!";
                break;
            case 1:
                response = "Excellent!";
                break;
            case 2:
                response = "Nice Work!";
                break;
            case 3:
                response = "Keep up good work!";
                break;
        }
        return response;
    }

    private String negativeResponse() {
        int randomNum = r.nextInt(4);
        String response = new String();
        switch (randomNum) {
            case 0:
                response = "No. Please try again";
                break;
            case 1:
                response = "Wrong. Try once more.";
                break;
            case 2:
                response = "Don't give up!";
                break;
            case 3:
                response = "No. Keep trying";
                break;
        }
        return response;
    }

    private void newQuestion() {
        int a = r.nextInt(10);
        int b = r.nextInt(10);
        int result = a * b;
        int answer;
        System.out.printf("How much is %d times %d\n", a, b);
        do {
            answer = s.nextInt();
            if (answer != result) {
                System.out.println(negativeResponse());
            }
        } while (answer != result);
        System.out.println(positiveResponse());

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
        Ch636_CAIReducingStudentsFatigue d = new Ch636_CAIReducingStudentsFatigue();
        d.play();
        System.out.println("Goodbye!");
    }
}
