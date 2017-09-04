import java.util.Scanner;

/**
 * Created by ola on 8/22/17.
    BMI Index

 */
public class Ch233 {

    void calculateBMI(){
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter your weight:");
        int weight = s.nextInt();
        System.out.println("Enter your height:");
        float height = s.nextFloat();
            System.out.printf("Your BMI: %d\n", (weight)/(int)(height*height));
    }

    void printTable(){
        System.out.println("BMI values:");
        System.out.println("Underweight:  less than 18.5");
        System.out.println("Normal:       between 18.5 and 24.9");
        System.out.println("Overweight:   between 24.9 and 29.9");
        System.out.println("Obese:        30 and greater");
    }

    public static void main(String[] args){
        Ch233 ch233 = new Ch233();
        ch233.calculateBMI();
        ch233.printTable();


    }
}
