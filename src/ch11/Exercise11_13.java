package ch11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercise11_13 {
    public static void main(String[] args) throws Exception {
        SutdaDeck deck = new SutdaDeck();

        deck.shuffle();

        Player[] players = {
                new Player("타짜", deck.pick(), deck.pick()),
                new Player("고수", deck.pick(), deck.pick()),
                new Player("물주", deck.pick(), deck.pick()),
                new Player("중수", deck.pick(), deck.pick()),
                new Player("하수", deck.pick(), deck.pick())
        };

        for (int i = 0; i < players.length; i++) {
            players[i].score = players[i].getPoint(deck.jokbo);
        }

        Arrays.sort(players);
        // '[타짜]7,2 1009'와 같이 점수가 높은 순으로 내림차순 출력 후
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }

        // '1위는 [중수]10,4입니다' 출력
        System.out.println("1위는 " + players[0] + "입니다.");
    }
}

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    int pos = 0; // 다음에 가져올 카드의 위치
    Map<String, Integer> jokbo = new HashMap<>();

    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = i == 0 || i == 2 || i == 7;

            cards[i] = new SutdaCard(num, isKwang);
        }
        registerJokbo();
    }

    // 족보를 저장한다.
    void registerJokbo() {
        int score = 3100;

        // 광땡 족보 설정
        jokbo.put("KK", 4000);
        // 땡 족보 설정
        for (int i = 10; i > 0; i--) {
            String num = String.valueOf(i);
            jokbo.put(num + num, score);
            score -= 10;
        }
        jokbo.put("12", 2060);
        jokbo.put("21", 2060);
        jokbo.put("14", 2050);
        jokbo.put("41", 2050);
        jokbo.put("19", 2040);
        jokbo.put("91", 2040);
        jokbo.put("110", 2030);
        jokbo.put("101", 2030);
        jokbo.put("410", 2020);
        jokbo.put("104", 2020);
        jokbo.put("46", 2010);
        jokbo.put("64", 2010);
    }


    SutdaCard pick() throws Exception {
        SutdaCard c = null;

        if (0 <= pos && pos < CARD_NUM) {
            c = cards[pos];
            cards[pos++] = null;
        }
        else
            throw new Exception("남아있는 카드가 없습니다.");

        return c;
    }

    void shuffle() {
        for (int x = 0; x < CARD_NUM * 2; x++) {
            int i = (int) (Math.random() * CARD_NUM);
            int j = (int) (Math.random() * CARD_NUM);

            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }
}

class Player implements Comparable<Player> {
    String name;
    SutdaCard card1;
    SutdaCard card2;
    int score;

    public Player(String name, SutdaCard card1, SutdaCard card2) {
        this.name = name;
        this.card1 = card1;
        this.card2 = card2;
    }

    // 점수를 반납한다.
    int getPoint(Map<String, Integer> jokbo) {
        Integer result = 0;

        if (card2.isKwang && card1.isKwang)
            return jokbo.get("KK");

        String twoCard = String.valueOf(card1.num) + String.valueOf(card2.num);
        // c1.num(형변환) + c2.num(형변환)
        if (jokbo.containsKey(twoCard))
            result = jokbo.get(twoCard);
        else
            result = (card1.num + card2.num) % 10 + 1000;

        return result;
    }

    @Override
    public String toString() {
        return "[" + name + "]" + card1 + "," + card2 + " " + score;
    }

    @Override
    public int compareTo(Player p) {
        return p.score - this.score;
    }
}