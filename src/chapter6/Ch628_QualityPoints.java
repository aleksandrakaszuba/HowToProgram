package chapter6;

import java.util.Scanner;

/**
 * Created by ola on 9/10/17.
 * Java. How to program P&H Deitel
 * Exercise 6.28
 * Returns student result after entering student avg
 */
public class Ch628_QualityPoints {
    public static int qualityPoints(int score) {
        int result;
        switch (score / 10) {

            case 10:
                result = 4;
                break;
            case 9:
                result = 4;
                break;
            case 8:
                result = 3;
                break;
            case 7:
                result = 1;
                break;
            default:
                result = 0;
                break;

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student's score");
        int score = s.nextInt();
        System.out.println("Result: " + qualityPoints(score));
    }
}
