package ch6;

public class Exercise6_23 {
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최댓값 :" + max(data));
        System.out.println("최댓값 :" + max(null));
        System.out.println("최댓값 :" + max(new int[]{}));

    }

    static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -99999;
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }
}
