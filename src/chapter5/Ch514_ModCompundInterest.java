package chapter5;

/**
 * Created by ola on 9/3/17.
 */

public class Ch514_ModCompundInterest {
    public Ch514_ModCompundInterest() {
    }

    public static void main(String[] args) {
        double principal = 1000.0D;
        double rate = 0.0D;
        int years = 10;
        System.out.printf("%4s %10s %10s\n", new Object[]{"Year", "Interest", "Amount"});

        for (int i = 1; i <= years; ++i) {
            for (int j = 5; j <= 9; ++j) {
                rate = (double) j;
                double amount = principal * Math.pow(1.0D + rate / 100.0D, (double) (1 * i));
                if (j == 5) {
                    System.out.printf("%4d %10.2f %,10.2f\n", new Object[]{Integer.valueOf(i), Double.valueOf(rate), Double.valueOf(amount)});
                } else {
                    System.out.printf("%4s %10.2f %,10.2f\n", new Object[]{" ", Double.valueOf(rate), Double.valueOf(amount)});
                }
            }
        }

    }
}
