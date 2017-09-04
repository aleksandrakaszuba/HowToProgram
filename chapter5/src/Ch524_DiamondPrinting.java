import java.util.Scanner;

/**
 * Created by ola on 9/3/17.
 */
public class Ch524_DiamondPrinting {
    public void diamond(int num) {

        for (int i = 0; i <= num / 2; i++) {
            for (int j = 1; j <= num / 2; j++) {
                if (j <= num / 2 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int j = 0; j <= num / 2; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        for (int i = 0; i < num / 2; i++) {
            for (int j = 0; j < num / 2; j++) {
                if (j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < num / 2; j++) {
                if (j < num / 2 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ch524_DiamondPrinting stars = new Ch524_DiamondPrinting();
        int num;
        do{
            System.out.println("Enter side of a diamond (odd):");
            num = s.nextInt();
        }while (num<1 || num>19 || num%2==0);

        stars.diamond(num);
    }
}
