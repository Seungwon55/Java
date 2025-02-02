package ch5;

import java.util.Scanner;

public class Exercise5_7 {
    public static void main(String[] args) {
        int money = Integer.parseInt(args[0]);

        System.out.println("money : " + money);

        int[] coinUnit = {500,100,50,10};  // 동전 단위
        int[] coin = {5,5,5,5};  // 단위별 동전의 개수

        for (int i = 0; i < coinUnit.length; i++) {
            int coinNum = 0;

            // 동전의 개수만큼만 반납할 수 있다.
            coinNum = money / coinUnit[i];
            coinNum = Math.min(coinNum, coin[i]);
            coin[i] -= coinNum;
            money -= coinUnit[i] * coinNum;

            System.out.println(coinUnit[i] + "원 : " + coinNum);
        }

        if (money > 0) {
            System.out.println("거스름돈이 부족합니다.");
            System.exit(0);
        }

        System.out.println("=남은 동전의 개수=");

        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원 : " + coin[i]);
        }
    }
}
