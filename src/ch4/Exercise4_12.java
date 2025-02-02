package ch4;

public class Exercise4_12 {
    public static void main(String[] args) {
        /*for (int i = 2; i <= 8; i+=3) {
            for (int j = 1; j <= 3; j++) {
                for (int k = i; k < i + 3; k++) {
                    if (k >= 10) break;
                    System.out.printf("%d*%d=%d\t", k, j, k*j);
                }
                System.out.println();
            }
            System.out.println();
        }*/

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 3; j++) {
                int x = (i - 1) / 3 * 3 + 1 + j;
                int y = i % 3 == 0 ? 3 : i % 3;

                if (x > 9)
                    break;

                System.out.printf("%d*%d=%d\t", x, y, x*y);

                if (i % 3 == 0 && j % 3 == 0)
                    System.out.println();
            }
            System.out.println();
        }
    }
}
