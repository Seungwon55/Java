package ch4;

import java.util.Scanner;

public class Exercise4_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int answer = (int) (Math.random() * 100) + 1;
        int challenge;

        do {
            count++;
            System.out.print("숫자를 입력하세요 : ");
            challenge = sc.nextInt();

            if (answer > challenge) {
                System.out.println("더 큰 수를 입력하세요.");
            }
            else if (answer < challenge) {
                System.out.println("더 작은 수를 입력하세요.");
            }
            else {
                System.out.println("정답입니다.");
                System.out.println("시도 횟수는 " + count + "번입니다.");
                break;
            }
        }
        while (true);
    }
}
