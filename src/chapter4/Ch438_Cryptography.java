package chapter4;

/**
 * Created by ola on 9/4/17.
 */

import java.util.Scanner;

public class Ch438_Cryptography {
    public Ch438_Cryptography() {
    }

    public int encrypt(int number) {
        int code = 0;
        int digits = 0;
        number = Math.abs(number);
        if (number == 0) {
            return 1;
        } else {
            int currentdigit;
            while (number > 0) {
                currentdigit = (number % 10 + 7) % 10;
                number /= 10;
                code = code * 10 + currentdigit;
                ++digits;
            }

            code = this.reverseDigits(code);
            int k = 0;

            for (int c = 0; k < digits; code /= 10) {
                currentdigit = (int) ((double) (code % 10) * Math.pow(10.0D, 1.0D));
                c += currentdigit;
            }

            return code;
        }
    }

    public int shuffleDigits(int Number) {
        return 1;
    }

    public int reverseDigits(int number) {
        int n = 0;

        for (int var4 = 0; number > 0; ++var4) {
            int current = number % 10;
            number /= 10;
            n = n * 10 + current;
        }

        return n;
    }

    public int decrypt(int code, int salt) {
        return 0;
    }

    public int numberOfDigits(int number) {
        int digits = 0;
        number = Math.abs(number);
        if (number == 0) {
            return 1;
        } else {
            while (number > 0) {
                number /= 10;
                ++digits;
            }

            return digits;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ch438_Cryptography f = new Ch438_Cryptography();

        int number;
        do {
            System.out.print("Enter a number:\n");
            number = s.nextInt();
        } while (f.numberOfDigits(number) < 4);

        System.out.println(f.encrypt(number));
    }
}
