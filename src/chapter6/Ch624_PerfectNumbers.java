package chapter6;

/**
 * Created by ola on 9/10/17.
 * Java. How to program P&H Deitel
 * Exercise 6.24
 * Checks if a number perfect (sum of consecutive integers) and prints them in order
 */
public class Ch624_PerfectNumbers {

    public static boolean isPerfectNumber(int numberToTest) {
        int total = 0;
        int i = 0;
        while (total < numberToTest) {
            total += i;
            i++;
        }
        if (numberToTest == total) {
            return true;
        } else {
            return false;
        }
    }

    public static void printPrimes(int numbers) {
        int sum = 0;
        int i = 1;
        int j;
        while (sum < 1000) {
            j = 1;
            while (j < i) {
                System.out.print(j + " + ");
                j++;
            }
            sum += i;
            System.out.println(i + " = " + sum);
            i++;
        }
    }

    public static void main(String[] args) {
        // System.out.println(isPerfectNumber(1));
        printPrimes(1000);
    }
}
