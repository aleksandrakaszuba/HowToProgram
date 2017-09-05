/**
 * Created by ola on 8/29/17.
 */
public class Ch44 {


    public static void main(String[] args) {

       /* int x = 10, y = 20 , z;

        z = x++ +y;


        int count = 0;

        if(count>10){
            //do sth
        }

        int total = 0;
        total = total - --x;

        int q = 0;

        q /=x;
        q = q/x;

        int sum = 0;
        int x2 = 1;

        sum += x;*/


      /* int x=1, total;
        while (x<=10){
            total +=x;
            ++x;
        }*/

        int y;
        int x = 1;
        int total = 0;
        while (x <= 10) {
            y = x * x;
            System.out.println(y);
            total += y;
            ++x;
        }
        System.out.printf("Total is %d", total);
    }
}