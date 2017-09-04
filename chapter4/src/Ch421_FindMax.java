import java.util.Scanner;

/**
 * Created by ola on 8/31/17.
 */
public class Ch421_FindMax{



    public  static void main(String[] args){
        int max=0;
        int item=0;
        Scanner s = new Scanner(System.in);
        for (int i=0; i<10; i++){
            System.out.println("Enter number:");
            item = s.nextInt();
            if(i==0){
            max = item;
            }
            if (item>max){
                max=item;
            }
        }
        System.out.printf("Max is: %d\n", max);

    }
}
