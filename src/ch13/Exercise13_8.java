package ch13;

import java.util.*;

public class Exercise13_8 {
    Vector words = new Vector();
    String[] data = {"태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카"};

    int interval = 2 * 1000;

    WordGenerator wg = new WordGenerator();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercise13_8 game = new Exercise13_8();
        game.wg.setDaemon(true);
        game.wg.start(); // WordGenerator 쓰레드 시작

        Vector words = game.words;

        while (true) { // 무한 반복
            System.out.println(words);

            System.out.print("단어를 입력하세요 : ");
            String input = sc.next().trim();

            int index = words.indexOf(input); // 단어 삭제를 위해 vector에서 위치 찾기

            if (index != -1) // 단어를 찾으면, 단어 삭제
                words.remove(index);

            if (words.isEmpty())
                break;
        }
    }

    class WordGenerator extends Thread {
        @Override
        public void run() {
            while (true) {
                int random = (int) (Math.random() * data.length);
                words.add(data[random]);

                try {
                    Thread.sleep(interval);
                } catch (InterruptedException e) {}
            }
        }
    }
}
