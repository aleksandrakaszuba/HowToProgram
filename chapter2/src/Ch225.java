import java.util.Scanner;

/**
 * Created by ola on 8/22/17.
 * Even and odd numbers
 */
public class Ch225 {
    Ch225(){ }
    void findOddEven(){
        Scanner s  = new Scanner(System.in);
        int x = 0;
        System.out.println("Enter number:");
         x = s.nextInt();

        if(x%2 == 0){
                System.out.printf("%d is even\n", x);
            }else{
                System.out.printf("%d is odd\n", x);
            }
    }

    public static void main(String[] args){
        Ch225 ch225 = new Ch225();
        ch225.findOddEven();
    }
}
