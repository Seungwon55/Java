package ch12;

public class Exercise12_5 {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick(0);
        System.out.println(c);

        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
    }
}

enum Kind {
    CLOVER, HEART, DIAMOND, SPADE
}

enum Number {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

class Card {
    Kind kind;
    Number number;

    public Card() {
        this(Kind.SPADE, Number.ACE);
    }

    public Card(Kind kind, Number number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        return "[" + kind + "," + number + "]";
    }
}

class Deck {
    final int CARD_NUM = Kind.values().length * Number.values().length;
    Card[] cards = new Card[CARD_NUM];

    Deck() {
        int num = 0;

        for (Kind kind : Kind.values()) {
            for (Number number : Number.values()) {
                cards[num++] = new Card(kind, number);
            }
        }
    }

    Card pick(int index) {
        return cards[index];
    }

    Card pick() {
        int index = (int) (Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int r = (int) (Math.random() * CARD_NUM);

            Card tmp = cards[i];
            cards[i] = cards[r];
            cards[r] = tmp;
        }
    }
}

