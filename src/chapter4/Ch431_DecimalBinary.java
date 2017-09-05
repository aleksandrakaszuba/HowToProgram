package chapter4;

import java.util.Scanner;

/**
 * Created by ola on 8/31/17.
 */
public class Ch431_DecimalBinary {
    //inputs 0s and 1s - a binary number
    //outputs a decimal version

    public int decimalNumber(int binaryNumber) {
        int decimalNumber = 0;
        int bn = binaryNumber;
        int i = 0;
        while (bn > 0) {
            decimalNumber += (int) ((bn % 10) * (Math.pow(2, i)));
            bn = bn / 10;
            i++;
        }
        return decimalNumber;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ch431_DecimalBinary p = new Ch431_DecimalBinary();
        System.out.print("Enter binary number:\n");
        int number = s.nextInt();
        System.out.println(p.decimalNumber(number));
    }
}