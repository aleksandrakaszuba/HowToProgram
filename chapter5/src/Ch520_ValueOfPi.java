import java.util.Scanner;

/**
 * Created by ola on 9/3/17.
 */
public class Ch520_ValueOfPi {

    public double calculatePi(int terms) {
        double pi = 4;
        double c = 4;
        int k = 3;
        boolean flag = false;
        double check;
        for (int i = 0; i < terms; i++) {

            if (i % 2 == 0) {
                pi -= (c / k);

            } else {
                pi += (c / k);
            }
            k += 2;
            /// in which term pi would be 3.14159
            check = pi * 100000;
          //  System.out.println(check);
            if (flag == false) {
                if ((int) check == 314159) {
                    System.out.println("term = " + i);
                    flag = true;
                }
            }

        }
        return pi;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int terms = 1;
        Ch520_ValueOfPi p = new Ch520_ValueOfPi();
       /* System.out.println("Enter number of terms for Pi calculation:");
        terms  = s.nextInt();
       */
        System.out.println(p.calculatePi(200000));
    }
}
