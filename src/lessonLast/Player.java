package lessonLast;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    protected ArrayList<Card> hand = new ArrayList<>();
    private boolean isWinner = true;

    public boolean GetisWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }
    public int totalHandsValue(){
        int total = 0;
        for (Card card : hand){
            total += card.getValue();
        }
        return total;
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public void printHand() {
        System.out.println("-----Ваша рука-----");
        for (Card c : hand) {
            System.out.println(c);
        }
        System.out.println("-------------------");
    }

    public String needsCard(){
        this.printHand();
        System.out.println("Нужна тебе еще карта? (да/нет)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;
    }


}

