package lesson13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(1995, 13, 100, "Золото");
        Coin coin2 = new Coin(1995, 13, 100, "Бронза");
        Coin coin3 = new Coin(1995, 13, 100, "Медь");
        Coin coin4 = new Coin(1995, 13, 100, "Серебро");
        Coin coin5 = new Coin(1995, 13, 100, "Платина");
        TreeSet<Coin> test = new TreeSet<>();
        test.add(coin1);
        test.add(coin2);
        test.add(coin3);
        test.add(coin4);
        test.add(coin5);
        Coin coin6 = new Coin(1995, 13, 100, "Золото");
        Coin coin7 = new Coin(1995, 13, 100, "Бронза");
        Coin coin8 = new Coin(1995, 13, 100, "Медь");
        Coin coin9 = new Coin(1995, 13, 100, "Серебро");
        Coin coin10 = new Coin(1995, 13, 100, "Платина");
        ArrayList<Coin> test2 = new ArrayList<>();
        test2.add(coin6);
        test2.add(coin7);
        test2.add(coin8);
        test2.add(coin9);
        test2.add(coin10);
        Collections.sort(test2);
        for (Coin c : test2){
            System.out.println(c);
        }
        System.out.println("_______________________");

        for (Coin coin: test){
            System.out.println(coin);
        }

    }
}
