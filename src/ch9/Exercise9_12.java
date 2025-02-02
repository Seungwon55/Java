package ch9;

public class Exercise9_12 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(getRand(1, -3) + ",");
        }
    }

    static int getRand(int from, int to) {
        int len = Math.abs(from - to) + 1;

        return (int) (Math.random() * len) + Math.min(from, to);
    }
}
