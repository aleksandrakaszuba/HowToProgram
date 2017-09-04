/**
 * Created by ola on 9/3/17.
 */
public class Ch512_ProductOfOddIntegers {

    public static void main(String[] args) {
        int product=1;
        for (int i=1; i<=15; i+=2){
            //System.out.println(i);
            product *=i;
        }
        System.out.print(product);
    }
}
