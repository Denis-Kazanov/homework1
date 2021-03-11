package lesson17;

import lesson13.Coin;

import java.util.Comparator;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(1991, 10, 130, "Золото");
        Coin coin2 = new Coin(1993, 10, 120, "Золото");
        Coin coin3 = new Coin(1994, 10, 100, "Золото");
        Coin coin4 = new Coin(1992, 10, 100, "Золото");
        Coin coin5 = new Coin(1991, 10, 1010, "Золото");

        TreeSet <Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        for(Coin c : coins){
            System.out.println(c);
        }

    }
}
