package lesson13;

import java.util.HashSet;

public class Main1 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(1990, 10, 1000, "Золото");
        Coin coin2 = new Coin(1990, 10, 1000, "Золото");
        Coin coin3 = new Coin(1990, 10, 1000, "Золото");
        Coin coin4 = new Coin(1990, 10, 1000, "Золото");
        Coin coin5 = new Coin(1991, 10, 1000, "Золото");
        HashSet<Coin> test = new HashSet<>();
        test.add(coin1);
        test.add(coin2);
        test.add(coin3);
        test.add(coin4);
        test.add(coin5);
        System.out.println(test);
    }
}
