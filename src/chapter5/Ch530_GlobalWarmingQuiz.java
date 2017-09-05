package chapter5;

import java.util.Scanner;

/**
 * Created by ola on 9/4/17.
 * Java. How to program P&H Deitel
 * Exercise 5.30
 * Global Warming Facts Quiz
 */

public class Ch530_GlobalWarmingQuiz {
    private int numberOfQuestions = 5;

    private String q1 = "How are humans making greenhouse gases of our own?\n" +
            "1 - burning fossil fuels in our cars\n" +
            "2 - burning forests\n" +
            "3 - with large-scale agriculture\n" +
            "4 - all of these\n";

    private String q2 = "Earth’s temperatures are stable because we\n" +
            "are surrounded by ________ which allows the\n" +
            "right amount of sunlight in to warm the Earth\n" +

            "1 - a cloud layer\n" +
            "2 - an atmosphere\n" +
            "3 - gravity\n" +
            "4 - water\n";

    private String q3 = "Too many greenhouse gasses in the atmosphere may block heat from escaping\n" +
            "into space and trap too much heat next to the Earth’s surface causing: ____________.\n" +

            "1 - another ice age\n" +
            "2 - global warming\n" +
            "3 - earthquakes\n" +
            "4 - volcanic eruptions\n";

    private String q4 = "Something that might happen because of global warming is:\n" +

            "1 - melting polar ice caps\n" +
            "2 - more reflected sunlight off the ice pack\n" +
            "3 - lower sea levels\n" +
            "4 - a sale on bathing suits\n";

    private String q5 = "The layer of the atmosphere closest to Earth is called the:\n" +

            "1 - troposphere\n" +
            "2 - stratosphere\n" +
            "3 - exosphere\n" +
            "4 - mesosphere\n";


    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }


    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public String getQ4() {
        return q4;
    }

    public void setQ4(String q4) {
        this.q4 = q4;
    }

    public String getQ5() {
        return q5;
    }

    public void setQ5(String q5) {
        this.q5 = q5;
    }

    private boolean checkAnswer(int questionNumber, int answer) {
        if (getAnswers(questionNumber) == answer) {
            return true;
        } else {
            return false;
        }
    }

    private int getAnswers(int questionNumber) {
        int answer = 1;
        switch (questionNumber) {
            case 0:
                answer = 4;
            case 1:
                answer = 2;
            case 2:
                answer = 2;
            case 3:
                answer = 1;
            case 4:
                answer = 1;
        }
        return answer;
    }

    private String messageAboutResults(int totalResult) {
        String s = new String();
        switch (totalResult) {
            case 4:
                s = "Very Good";
                break;
            case 5:
                s = "Excellent";
                break;
            default:
                s = "Time to brush up your knowledge on global warming";
        }
        return s;
    }

    private void displayResults(int totalResult, int numberOfQuestions) {
        System.out.printf("Your results: %d ot of %d.\n %s\n", totalResult, numberOfQuestions, messageAboutResults(totalResult));
    }

    public void playQuiz() {
        Scanner s = new Scanner(System.in);
        int answer;
        int totalResult = 0;
        String[] questions = {getQ1(), getQ2(), getQ3(), getQ4(), getQ5()};
        for (int i = 0; i < getNumberOfQuestions(); i++) {

            do {
                System.out.print("Q" + (i + 1) + ": " + questions[i]);
                answer = s.nextInt();
            } while (answer > 4 || answer < 1);

            if (checkAnswer(i, answer) == true) {
                totalResult++;
            }
        }
        displayResults(totalResult, getNumberOfQuestions());

    }

    public static void main(String[] args) {
        Ch530_GlobalWarmingQuiz q = new Ch530_GlobalWarmingQuiz();
        q.playQuiz();
    }
}
