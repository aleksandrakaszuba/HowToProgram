import java.util.Scanner;

/**
 * Created by ola on 8/22/17.
    Diameter, circumference, area of a circle
 */
public class Ch228 {

    void circles(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius of a circle:");
        int R  = s.nextInt();
        float r = ((float) R);
        System.out.printf("Diameter d = %.2f \n", 2 * r);
        System.out.printf("Area a = %.2f \n", Math.PI * r * r);
        System.out.printf("Circumference c = %.2f \n", 2 * Math.PI * r);
    }

    public static void main(String[] args){
        Ch228 ch228 = new Ch228();
        ch228.circles();
    }
}
