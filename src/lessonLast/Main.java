package lesson16;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Player player = new Player();
        Player player1 = new Player();
        Dealer dealer = new Dealer();

        BlackJackGame game = new BlackJackGame();

        game.addPlayer(player);
        game.addPlayer(player1);
        game.addPlayer(dealer);

        game.doFirstRound();

        game.doSecondRound();

        System.out.println("sdsdsdsd");
    }
}
