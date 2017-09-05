package chapter5;

/**
 * Created by ola on 9/4/17.
 * Java. How to program P&H Deitel
 * Exercise 5.32
 * Facebook user base growth
 */

public class Ch532_FbUserBaseGrowth {
    private int targetUserGrowth1 = 1000000000;
    private int targetUserGrowth2 = 2000000000;
    private int baseUsers = 500000000;
    private double rate = 0.05;

    public int getTargetUserGrowth1() {
        return targetUserGrowth1;
    }

    public void setTargetUserGrowth1(int targetUserGrowth1) {
        this.targetUserGrowth1 = targetUserGrowth1;
    }

    public int getTargetUserGrowth2() {
        return targetUserGrowth2;
    }

    public void setTargetUserGrowth2(int targetUserGrowth2) {
        this.targetUserGrowth2 = targetUserGrowth2;
    }

    public int getBaseUsers() {
        return baseUsers;
    }

    public void setBaseUsers(int baseUsers) {
        this.baseUsers = baseUsers;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    /*
    A = P * (1 + r/n)^(nt)
    Where:
    A = the future value of the investment/loan, including interest
    P = the principal investment amount (the initial deposit or loan amount)
    r = the annual interest rate (decimal)
    n = the number of times that interest is compounded per year
    t = the number of years the money is invested or borrowed for
    */

    public double timeOfGrowth(int targetUserGrowth, double rate, int baseUsers) {
        return (Math.log(targetUserGrowth / baseUsers) / Math.log(1 + rate));
    }

    public static void main(String[] args) {

        Ch532_FbUserBaseGrowth g = new Ch532_FbUserBaseGrowth();

        System.out.printf("It will take %.2f months to grow number of users from %,d to %,d\n", g.timeOfGrowth(g.getTargetUserGrowth1(), g.getRate(), g.getBaseUsers()), g.getBaseUsers(), g.getTargetUserGrowth1());
        System.out.printf("It will take %.2f months to grow number of users from %,d to %,d\n", g.timeOfGrowth(g.getTargetUserGrowth2(), g.getRate(), g.getBaseUsers()), g.getBaseUsers(), g.getTargetUserGrowth2());

    }
}