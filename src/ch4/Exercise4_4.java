package ch4;

public class Exercise4_4 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (sum < 100) {
            i++;

            if (i % 2 != 0)
                sum += i;
            else
                sum += i * -1;
        }

        System.out.println(i + " 번째까지의 합 : " + sum);
    }
}
