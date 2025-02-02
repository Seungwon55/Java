package ch7;

public class Exercise7_2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        try {
            System.out.println(deck.pick(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }

        System.out.println();

        try {
            System.out.println(deck.pick(21));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class SutdaCard {
    final int num;
    final boolean isKwang;

    SutdaCard() {
        this(1,true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public String toString(){
        return num + (isKwang ? "K" : "");
    }
}

class SutdaDeck {
    static final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            boolean isKwang = i == 0 || i == 2 || i == 7;

            cards[i] = new SutdaCard(i % 10 + 1, isKwang);
        }
    }

    void shuffle() {
        for (int i = 0; i < CARD_NUM; i++) {
            int random = (int) (Math.random() * CARD_NUM);

            SutdaCard tmp = cards[i];
            cards[i] = cards[random];
            cards[random] = tmp;
        }
    }

    SutdaCard pick(int index) throws Exception {
        if (index >= 20)
            throw new Exception("고른 위치가 유효하지 않습니다.");

        return cards[index];
    }

    SutdaCard pick() {
        int random = (int) (Math.random() * CARD_NUM);

        return cards[random];
    }
}