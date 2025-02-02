package ch4;

public class Exercise4_11 {
    public static void main(String[] args) {
        /*int num1 = 1;
        int num2 = 1;

        int[] arr = new int[10];
        arr[0] = num1;
        arr[1] = num2;
        System.out.print(num1 + "," + num2);
        for (int i = 2; i < 10; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];

            System.out.print("," + arr[i]);
        }*/
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;

        System.out.print(num1+","+num2);

        for (int i = 0 ; i < 8 ; i++ ) {
            num3 = num1 + num2;
            System.out.print("," + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
