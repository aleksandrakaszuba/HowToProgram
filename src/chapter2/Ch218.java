package chapter2;

import java.util.Scanner;

import java.util.Scanner;

/**
 * Created by ola on 8/21/17.
 */
public class Ch218 {

    void rectangle(int width, int height) {
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                if (i == 0 || i == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
    }

    void diamond(int side) {

        int mid = side / 2;

        for (int j = 0; j < side; j++) {

            for (int i = 0; i < side; i++) {
                if (i == mid - j || i == mid + j || i == j - mid || (i == 3 * mid - j)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    void circle(int width, int height) {

        int wmid = width / 2;
        int hmid = height / 2;
        for (int j = 0; j < height; j++) {

            for (int i = 0; i < width; i++) {
                if (i == wmid - j) {
                    //i == wmid+j || i==j-wmid || (i == 3*wmid-j  )
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.print("\n");

    }
  /*  void arrow(int width, int height) {
        if(width<4 || height<4){
            System.out.println("to small for an arrow");
        }
    }*/


    public static void main(String[] args) {

        Ch218 ch218 = new Ch218();
        ch218.circle(9, 9);
        //ch218.diamond(9);
        // ch218.rectangle(9, 9);

    }

}