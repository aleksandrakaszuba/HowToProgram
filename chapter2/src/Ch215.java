import java.util.Scanner;

/**
 * Created by ola on 8/21/17.
 */
public class Ch215 {
    Ch215(){
        int x = 0;
        int y = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x:");
        x = input.nextInt();
        System.out.println("Enter y:");
        y = input.nextInt();
        System.out.printf("Sum: %d \n", x+y);
        System.out.printf("Difference: %d\n", x-y);
        System.out.printf("Division: %d\n", x/y);
        System.out.printf("Product: %d\n", x*y);
    }

}
