package chapter6;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by ola on 9/16/17.
 * Java. How to program P&H Deitel
 * Exercise 6.37
 * Modified version CAI - Monitoring of progress
 */
public class Ch637_CAI_Monitoring {
    Random r = new Random();
    Scanner s = new Scanner(System.in);
    int wrongAnswers = 0;
    int goodAnswers = 0;
    int totalAnswers = 0;

    public int getWrongAnswers() {
        return wrongAnswers;
    }

    public void setWrongAnswers(int wrongAnswers) {
        this.wrongAnswers = wrongAnswers;
    }

    public int getGoodAnswers() {
        return goodAnswers;
    }

    public void setGoodAnswers(int goodAnswers) {
        this.goodAnswers = goodAnswers;
    }

    public int getTotalAnswers() {
        return totalAnswers;
    }

    public void setTotalAnswers(int totalAnswers) {
        this.totalAnswers = totalAnswers;
    }

    public void monitorResponses(int answer) {

        if (answer == -1) {
            setWrongAnswers(getWrongAnswers() + 1);
        } else {
            setGoodAnswers(getGoodAnswers() + 1);
        }
        setTotalAnswers(getTotalAnswers() + 1);
        System.out.println("Result:" + getGoodAnswers() * 100 / getTotalAnswers() + "%");
        if (getTotalAnswers() == 10) {
            if (getGoodAnswers() * 100 / getTotalAnswers() < 75) {
                System.out.printf("Please ask your teacher for extra help\n");
            } else {
                System.out.printf("Congratulation you are ready to go to the next level!\n");
            }
            setGoodAnswers(0);
            setWrongAnswers(0);
            setTotalAnswers(0);
        }
    }

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
                monitorResponses(-1);
            }
        } while (answer != result);
        System.out.println(positiveResponse());
        monitorResponses(+1);

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
        Ch637_CAI_Monitoring d = new Ch637_CAI_Monitoring();
        d.play();
        System.out.println("Goodbye!");
    }
}
