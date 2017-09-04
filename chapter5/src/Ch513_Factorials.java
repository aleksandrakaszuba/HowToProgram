/**
 * Created by ola on 9/3/17.
 */
public class Ch513_Factorials {


    public long factorial(int n){
        long factorial = 1;
        long k=0;
        while (k<n) {
            factorial *= (n - k);
            k++;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Ch513_Factorials f =new Ch513_Factorials();
        System.out.println(f.factorial(31));
    }


}
