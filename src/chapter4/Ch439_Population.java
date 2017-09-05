/**
 * Created by ola on 9/4/17.
 */

package chapter4;

import java.util.Scanner;

public class Ch439_Population {
    public Ch439_Population() {
    }

    void populationGrowth(double rate, double population, int year) {
        System.out.printf("%-5s %17s %15s\n", new Object[]{"Year", "Population[Bln]", "Increase[Bln]"});

        for (int j = 0; j < year; ++j) {
            double increase = population * rate / 100.0D;
            population += population * rate / 100.0D;
            System.out.printf("%-5d %17.2f %15.2f \n", new Object[]{Integer.valueOf(2017 + j), Double.valueOf(population), Double.valueOf(increase)});
        }

    }

    public static void main(String[] args) {
        new Scanner(System.in);
        Ch439_Population p = new Ch439_Population();
        p.populationGrowth(1.11D, 7.5D, 75);
    }
}
