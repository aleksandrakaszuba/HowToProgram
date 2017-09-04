import java.util.Scanner;

/**
 * Created by ola on 8/30/17.
 */
public class Ch419_Comissions_calc {
    private int weeklyBaseAmount = 200;
    private double commissionRate = 0.09;
    private double weeklySalesValue = 0;
    private int weeklyTotalEarnings = 0;

    double itemValue;

    public int getWeeklyBaseAmount() {
        return weeklyBaseAmount;
    }

    public void setWeeklyBaseAmount(int weeklyBaseAmount) {
        this.weeklyBaseAmount = weeklyBaseAmount;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getWeeklySalesValue() {
        return weeklySalesValue;
    }

    public void setWeeklySalesValue(double weeklySalesValue) {
        this.weeklySalesValue = weeklySalesValue;
    }

    public int getWeeklyTotalEarnings() {
        return weeklyTotalEarnings;
    }

    public void setWeeklyTotalEarnings(int weeklyTotalEarnings) {
        this.weeklyTotalEarnings = weeklyTotalEarnings;
    }

    public double getItemValue() {
        return itemValue;
    }

    public void setItemValue(double itemValue) {
        this.itemValue = itemValue;
    }

    public void calculateSales(Ch419_Comissions_calc salesman){
        Scanner s = new Scanner(System.in);
        double item = 0;
        while(item != -1){
            System.out.println("Enter sold item value or -1 to exit:");
            item = s.nextDouble();
            if(item >= 0){
                salesman.setItemValue(item);
                salesman.setWeeklySalesValue(salesman.getWeeklySalesValue() + salesman.getItemValue());
            }
        }
        salesman.setWeeklyTotalEarnings((int) (salesman.getWeeklySalesValue() * salesman.getCommissionRate() ));
        System.out.printf("Total weekly earnings: %d", salesman.getWeeklyTotalEarnings()+ salesman.getWeeklyBaseAmount());
    }

    public static void main(String[] args){
        //enter data items sold per salesman
        //calculate earnings
        // display earnings for that salesman

        Ch419_Comissions_calc salesman1 = new Ch419_Comissions_calc();
        salesman1.calculateSales(salesman1);

    }
}
