package chapter2;

/**
 * Created by ola on 8/22/17.
 * Population growth calculator
 */
public class Ch234 {
    void populationGrowth(double rate, double population, int year) {

        for (int j = 0; j < year; j++) { //rows
            population = ((population * rate) / 100) + population;
            System.out.printf("population year %d = %f \n", j + 1, population);
        }
    }

    public static void main(String[] args) {
        Ch234 ch234 = new Ch234();
        ch234.populationGrowth(1.11, 7.5, 3);

    }

}