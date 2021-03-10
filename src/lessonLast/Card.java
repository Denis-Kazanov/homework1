package lesson16;

import java.util.Objects;

public class Card {
    private String cardName;
    private int value;

    public Card() {
    }

    public Card(String cardName, int value) {
        this.cardName = cardName;
        this.value = value;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value && Objects.equals(cardName, card.cardName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardName, value);
    }

    @Override
    public String toString() {
        return cardName;
    }
}

