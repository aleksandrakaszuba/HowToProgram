package chapter6;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by ola on 9/10/17.
 * Java. How to program P&H Deitel
 * Exercise 6.29
 * Coin tossing game.
 */
public class Ch629_CoinTossing {
    enum COIN {HEADS, TAILS}

    ;

    int heads;
    int tails;

    public int getHeads() {
        return heads;
    }

    public void setHeads(int heads) {
        this.heads = heads;
    }

    public int getTails() {
        return tails;
    }

    public void setTails(int tails) {
        this.tails = tails;
    }

    Random r = new Random();

    private COIN flip() {
        COIN coin;
        if (r.nextInt(2) == 0) {
            coin = COIN.HEADS;
        } else {
            coin = COIN.TAILS;
        }
        return coin;
    }

    private void countTosses() {
        COIN coin = flip();
        System.out.println(coin);
        if (coin == COIN.HEADS) {
            setHeads(getHeads() + 1);
        } else {
            setTails(getTails() + 1);
        }

    }

    /*private int flip(){
        return r.nextInt(2);
    }*/
    /*  private void countTosses(){
        int toss = flip();
        System.out.println(toss);
        if(toss == 0 ){
           setHeads(getHeads()+1);
        }else{
            setTails(getTails()+1);
        }

    }*/
    public static void main(String[] args) {
        Ch629_CoinTossing c = new Ch629_CoinTossing();
        char nextToss;
        Scanner s = new Scanner(System.in);
        System.out.println("Toss coin? y/n");
        nextToss = s.next().charAt(0);

        while (nextToss == 'y') {
            c.countTosses();
            System.out.printf("HEADS: %d, TAILS: %d \n", c.getHeads(), c.getTails());
            System.out.println("Toss coin? y/n");
            nextToss = s.next().charAt(0);
        }
        System.out.println("Goodbye");

    }

}
