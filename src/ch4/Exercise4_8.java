package ch4;

public class Exercise4_8 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (i * 2 + j * 4 == 10)
                    System.out.printf("x=%d, y=%d\n", i, j);
            }
        }
    }
}
