package chapter6;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by ola on 9/16/17.
 * Java. How to program P&H Deitel
 * Exercise 6.39
 * Modified version CAI - Type of a problem selection
 */
public class Ch639_CAI_VaryingTypesOfProblems {
    Random r = new Random();
    Scanner s = new Scanner(System.in);
    int wrongAnswers = 0;
    int goodAnswers = 0;
    int totalAnswers = 0;

    private int getWrongAnswers() {
        return wrongAnswers;
    }

    private void setWrongAnswers(int wrongAnswers) {
        this.wrongAnswers = wrongAnswers;
    }

    private int getGoodAnswers() {
        return goodAnswers;
    }

    private void setGoodAnswers(int goodAnswers) {
        this.goodAnswers = goodAnswers;
    }

    private int getTotalAnswers() {
        return totalAnswers;
    }

    private void setTotalAnswers(int totalAnswers) {
        this.totalAnswers = totalAnswers;
    }

    private int difficultyLevelSelection() {
        System.out.printf("Select level of difficulty:\n");
        System.out.printf("(1 - for 1 digit numbers, 2 - for 2 digit no, etc.)\n");
        int level = s.nextInt();

        return (int) Math.pow(10, level);
    }

    private boolean monitorResponses(int answer) {
        boolean sessionComleted = false;
        if (answer == -1) {
            setWrongAnswers(getWrongAnswers() + 1);
        } else {
            setGoodAnswers(getGoodAnswers() + 1);
        }
        setTotalAnswers(getTotalAnswers() + 1);

        if (getTotalAnswers() == 10) {
            System.out.println("Your result:" + getGoodAnswers() * 100 / getTotalAnswers() + "%");
            if (getGoodAnswers() * 100 / getTotalAnswers() < 75) {
                System.out.printf("Please ask your teacher for extra help\n");
            } else {
                System.out.printf("Congratulation you are ready to go to the next level!\n");
            }
            setGoodAnswers(0);
            setWrongAnswers(0);
            setTotalAnswers(0);
            sessionComleted = true;
        }

        return sessionComleted;
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
                response = "No. Please try again:";
                break;
            case 1:
                response = "Wrong. Try once more:";
                break;
            case 2:
                response = "Don't give up!:";
                break;
            case 3:
                response = "No. Keep trying:";
                break;
        }
        return response;
    }

    private int problemTypeSelection() {
        int problem;
        System.out.printf("Select type of a problem to solve:\n");
        System.out.println(
                "1 - addition\n" +
                        "2 - substraction\n" +
                        "3 - multiplication\n" +
                        "4 - division\n" +
                        "5 - random\n"
        );
        problem = s.nextInt();
        return problem;
    }

    private double problemLoading(int problemType, int difficulty) {
        System.out.println(difficulty);
        int a = r.nextInt(difficulty);
        int b = r.nextInt(difficulty);
        double result = 0;

        if (problemType == 5) {
            problemType = 1 + r.nextInt(4);
        }
        switch (problemType) {
            case 1:
                System.out.printf("How much is %d plus%d\n", a, b);
                result = a + b;
                break;
            case 2:
                System.out.printf("How much is %d minus %d\n", a, b);
                result = a - b;
                break;
            case 3:
                System.out.printf("How much is %d times %d\n", a, b);
                result = a * b;
                break;
            case 4:
                if (b == 0) {
                    b = b + 1;
                }
                System.out.printf("How much is %d divided by %d\n", a, b);
                result = (double) a / b;
                break;
        }
        result = Math.round(result * 100);
        result = result / 100;
        return result;
    }

    private void newQuestion(int difficulty, int problemType) {
        boolean sessionComleted;
        double result = problemLoading(problemType, difficulty);
        System.out.println("res: " + result);
        double answer;

        do {
            answer = s.nextDouble();
            if (answer != result) {
                System.out.println(negativeResponse());
                sessionComleted = monitorResponses(-1);

            } else {
                System.out.println(positiveResponse());
                sessionComleted = monitorResponses(+1);
            }
            if (sessionComleted == true) {
                break;
            }
        } while (answer != result);
    }

    public void play() {
        char nextGame;
        int difficulty = difficultyLevelSelection();
        int problemType = problemTypeSelection();
        do {
            newQuestion(difficulty, problemType);
            System.out.println("Play again? (y/n):");
            nextGame = s.next().charAt(0);
        } while (nextGame == 'y');
    }

    public static void main(String[] args) {
        Ch639_CAI_VaryingTypesOfProblems d = new Ch639_CAI_VaryingTypesOfProblems();
        d.play();
        System.out.println("Goodbye!");
    }
}
