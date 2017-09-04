import java.util.Scanner;

/**
 * Created by ola on 9/2/17.
 */
public class Ch511_SmallestValue {
/*
    public int minValue(int number){

        return min;
    }

    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ch511_SmallestValue v = new Ch511_SmallestValue();
        int number;
        int count;
        int min;
        int i = 0;

        System.out.println("Enter number of numbers to compare:");
        count = s.nextInt();
        System.out.println("Enter number to compare:");
        min = s.nextInt();

        while (i<count){

            System.out.println("Enter number to compare:");
            number = s.nextInt();

            if(min >number){
                min = number;
            }
            i++;
        }
        System.out.printf("The min is: %d", min);

    }
}
