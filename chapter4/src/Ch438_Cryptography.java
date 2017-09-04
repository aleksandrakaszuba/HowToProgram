import java.util.Scanner;

/**
 * Created by ola on 9/1/17.
 */
public class Ch438_Cryptography {

    public int encrypt(int number) {
        int code = 0;
        int digits = 0;
        int currentdigit;
        number = Math.abs(number);

        if (number == 0) {
            return 1;
        }
        while (number > 0) {
            currentdigit = ((number % 10) + 7) % 10;
            number = number / 10;
            code = code * 10 + currentdigit;
            digits++;
        }
        code = reverseDigits(code);

        int k = 0;
        int c = 0;
        while (k < digits) {
            if (true) {
                currentdigit = (int) (code % 10 * Math.pow(10, 1));
            }


            c += currentdigit;
            code = code / 10;
        }


        return code;
    }

    public int shuffleDigits(int Number) {


        return 1;
    }

    public int reverseDigits(int number) {
        int current;
        int n = 0;
        int digits = 0;

        while (number > 0) {
            current = number % 10;
            number = number / 10;
            n = n * 10 + current;
            digits++;
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
        }
        while (number > 0) {
            number = number / 10;
            digits++;
        }
        return digits;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ch438_Cryptography f = new Ch438_Cryptography();
        int number;
        do {
            System.out.print("Enter a 4 - digit number:\n");
            number = s.nextInt();
        } while (f.numberOfDigits(number) < 4);
        System.out.println(f.encrypt(number));
    }
}
