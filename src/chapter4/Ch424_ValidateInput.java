package chapter4;

import java.util.Scanner;

/**
 * Created by ola on 8/31/17.
 */
public class Ch424_ValidateInput {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
        int result = 0;

        while (studentCounter <= 10) {
            System.out.print("enter 1=pass or 2=fail\n");
            result = s.nextInt();
            while (!(result == 1 || result == 2)) {
                System.out.printf("enter 1=pass or 2=fail\n");
                result = s.nextInt();
            }
            if (result == 1) {
                passes++;
            } else {
                failures++;
            }
            studentCounter++;
        }
        System.out.printf("Passed: %d, failed: %d\n", passes, failures);
        if (passes > 8) {
            System.out.print("Bonus to instructor\n");
        }
    }
}