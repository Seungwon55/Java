package ch5;

public class Exercise5_11 {
    public static void main(String[] args) {
        int[][] score = {
                {100,100,100}
                ,{20,20,20}
                ,{30,30,30}
                ,{40,40,40}
                ,{50,50,50}
        };
        int[][] arr = new int[score.length + 1][score[0].length + 1];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                arr[i][j] = score[i][j];
                arr[i][score[i].length] += arr[i][j];
                arr[score.length][j] += arr[i][j];
            }
            arr[score.length][score[i].length] += arr[i][score[i].length];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
