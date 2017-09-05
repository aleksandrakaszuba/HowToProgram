package chapter5;

/**
 * Created by ola on 9/3/17.
 * Java. How to program P&H Deitel
 * Exercise 5.21
 * Finding all integer values that can create a right triangle. Uses brute force.
 */

public class Ch521_PythagoreanTriples {
    public Ch521_PythagoreanTriples() {
    }

    public void triangles() {
        System.out.printf("%4s %4s %4s \n", "a", "b", "c");

        for (int a = 1; a <= 500; ++a) {
            for (int b = 1; b <= 500; ++b) {
                for (int c = 1; c <= 500; ++c) {
                    if (a * a + b * b == c * c) {
                        System.out.printf("%4d %4d %4d \n", a, b, c);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Ch521_PythagoreanTriples t = new Ch521_PythagoreanTriples();
        t.triangles();
    }
}
