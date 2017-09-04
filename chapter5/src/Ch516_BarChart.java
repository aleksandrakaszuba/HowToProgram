import java.util.Scanner;

/**
 * Created by ola on 9/3/17.
 */
public class Ch516_BarChart {
    public void displayStars(int num){
        for (int i = 0; i <num; i++){
                System.out.print("*");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ch516_BarChart chart = new Ch516_BarChart();


        int count = 5;
        int i=0;
        int a[] = new int[5];

        do {
            do {
                System.out.printf("Enter %d number between 0-30:\n", i);
                String k = new String("lala");
                a[i]  = s.nextInt();
            } while (a[i] > 30 || a[i] < 0);
            i++;

        }while(i<count);

        for (int j = 0; j<count; j++ ){

            chart.displayStars(a[j]);
        }

    }

}
