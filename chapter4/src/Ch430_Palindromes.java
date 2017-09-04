import java.util.Scanner;

/**
 * Created by ola on 8/31/17.
 */
public class Ch430_Palindromes {
    // is the number a palidrome
    //user enters a number
    //max 5 digits or prompt again
    // display info if it is or not a palindrome

    public String isPalindrome(int number) {
        boolean palindrome = true;
        int givenNumber = number;
        int[] a = new int[numberOfDigits(number)];
        int digit = 0;
        for (int i = 0; i < a.length; i++) {
            if (number > 0) {
                a[i] = number % 10;
                number = number / 10;
                //  System.out.printf("a[%d] = %d\n",i, a[i]);
            }
        }
        int k = a.length - 1;
        for (int i = 0; i < a.length / 2; i++) {
            //  System.out.printf("a[i] = %d \n" , a[i]);
            //  System.out.printf("a[k] = %d\n", a[k]);
            if (a[i] != a[k]) {
                palindrome = false;
            }
            k--;
        }
        if (palindrome == true) {
            return "Yes " + givenNumber + " is a palindrome\n";
        } else {
            return "No " + givenNumber + " is a not a palindrome\n";

        }
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
        Ch430_Palindromes p = new Ch430_Palindromes();
        int number;
        do {
            System.out.print("Enter a max 5-digit number:\n");
            number = s.nextInt();
        } while (p.numberOfDigits(number) < 5);
        System.out.print(p.isPalindrome(number));

    }


}
