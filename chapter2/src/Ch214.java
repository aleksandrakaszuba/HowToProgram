/**
 * Created by ola on 8/21/17.
 */
public class Ch214 {
     Ch214(){

         for (int i = 1; i <= 4; i++) {
             System.out.print(i + " ");
         }
         System.out.println();
         for (int i = 1; i <= 4; i++) {
             System.out.printf( "%d ", i);
         }
         System.out.println();
         StringBuilder s = new StringBuilder();
         for (int i = 1; i <= 4; i++) {
            s.append(i+" ");
         }
         System.out.println(s.toString());

     }
}
