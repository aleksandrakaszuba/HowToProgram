import java.util.Scanner;

/**
 * Created by ola on 9/1/17.
 */
public class Ch439_Population {
    void populationGrowth(double rate, double population, int year){
        System.out.printf("%-5s %17s %15s\n", "Year", "Population[Bln]", "Increase[Bln]");
        double increase;
        for (int j = 0; j<year; j++) { //rows
            increase = (population * rate)/100;
            population =((population * rate)/100) + population;

            System.out.printf("%-5d %17.2f %15.2f \n", 2017+j, population, increase);
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ch439_Population p = new Ch439_Population();
        p.populationGrowth(1.11, 7.5, 75);
    }
}
