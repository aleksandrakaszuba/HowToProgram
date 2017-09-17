package chapter6;

import java.util.Scanner;

/**
 * Created by ola on 9/10/17.
 * Java. How to program P&H Deitel
 * Exercise 6.34
 * Display table of binary, octal and hexadecimal numbers
 */

public class Ch634_TableOfBinary {
    //radix 1-10
    private int convertToRadix(int num, int radix) {
        int temp = 0;
        int result = 0;
        int r;
        int digits = 0;
        while (num > 0) {
            r = num % radix;
            temp = (temp * 10) + r;
            digits++;
            num = num / radix;
        }
        while (digits > 0) {
            r = temp % 10;
            result = result * 10 + r;
            temp = temp / 10;
            digits--;
        }
        return result;
    }

    //radix 1-34
    public String convertToAllBases(int num, int radix) {
        StringBuilder s = new StringBuilder();
        int r;
        while (num > 0) {
            r = num % radix;
            if (r < 10) {
                s.append((char) (r + 48));
            } else {
                s.append((char) (r + 55));
            }
            num = num / radix;
        }
        s.reverse();
        return s.toString();
    }

    public void displayTable() {
        System.out.printf("%10s %10s %10s %12s\n", "Decimal", "Binary", "Octal", "Hexadecimal");
        for (int i = 1; i <= 256; i++) {
            System.out.printf("%10s %10s %10s %12s \n", i, convertToAllBases(i, 2), convertToAllBases(i, 8), convertToAllBases(i, 16));
        }
    }

    public static void main(String[] args) {
        Ch634_TableOfBinary d = new Ch634_TableOfBinary();
        d.displayTable();
    }
}
