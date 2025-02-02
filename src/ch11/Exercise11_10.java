package ch11;

import java.util.*;

public class Exercise11_10 {
    public static void main(String[] args) {
        // Set가 iterator()로 만들어져 출력하면 정렬되어 출력된다.
        List<Integer> list = new ArrayList<>();
        int[][] board = new int[5][5];

        for (int i = 0; list.size() < 25; i++) {
            int random = (int) (Math.random() * 30) + 1;

            if (list.contains(random))
                continue;

            list.add(random);
        }

        Iterator<Integer> it = list.iterator();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = it.next();
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
}