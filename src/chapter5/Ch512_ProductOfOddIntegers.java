package chapter5;

/**
 * Created by ola on 9/4/17.
 * Java. How to program P&H Deitel
 * Exercise 5.12
 */
public class Ch512_ProductOfOddIntegers {

    public static void main(String[] args) {

        int product = 1;
        for (int i = 1; i <= 15; i += 2) {
            product *= i;
        }
        System.out.print(product);
    }
}
