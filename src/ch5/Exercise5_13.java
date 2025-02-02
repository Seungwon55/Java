package ch5;

import java.util.Scanner;

public class Exercise5_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {"television","computer","mouse","phone"};

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray();

            for (int j = 0; j < question.length; j++) {
                int random = (int) (Math.random() * (question.length));

                char tmp = question[j];
                question[j] = question[random];
                question[random] = tmp;
            }

            System.out.printf("Q%d. %s의 정답을 입력하세요. > ", i+1, new String(question));
            String answer = sc.next();

            if (answer.equals(words[i]))
                System.out.println("맞았습니다.");
            else
                System.out.println("틀렸습니다.");
        }
    }
}
