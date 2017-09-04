import java.util.Scanner;

/**
 * Created by ola on 8/31/17.
 */
import java.util.Scanner;

public class Ch423_TwoLargestNumbers {

        public  static void main(String[] args){
            int largest=0;
            int large=0;
            int item=0;
            Scanner s = new Scanner(System.in);
            for (int i=0; i<10; i++){
                System.out.println("Enter number:");
                item = s.nextInt();
                if(i==0){
                    largest = item;
                }
                if(i==1 & item<=largest){
                    large = item;
                }
                if (i>=1){
                    if(item>largest){
                        large=largest;
                        largest=item;
                    }else if(item>large) {
                        large = item;
                    }
                }
            }
            System.out.printf("Largest is: %d, large is %d\n", largest, large);


    }

}
