package chapter5;

/**
 * Created by ola on 9/4/17.
 */

public class Ch513_Factorials {
    public Ch513_Factorials() {
    }

    public long factorial(int n) {
        long factorial = 1L;

        for (long k = 0L; k < (long) n; ++k) {
            factorial *= (long) n - k;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Ch513_Factorials f = new Ch513_Factorials();
        System.out.println(f.factorial(31));
    }
}
