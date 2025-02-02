package ch9;

import java.util.Scanner;

public class Exercise9_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시작 단과 끝 단, 두 개의 정수를 입력하세요 : ");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();

        for (int i = i1; i <= i2; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
            System.out.println();
        }
    }
}
