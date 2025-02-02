package ch4;

public class Exercise4_15 {
    public static void main(String[] args) {
        int number = 12321;
        int tmp = number;
        int result = 0; // number 변수 를 거꾸로 변환해서 담을 변수
        int count = 10000;

        while(tmp !=0) {
            result += tmp % 10 * count;
            // result에 number % 10을 한 후 10씩 곱해서 더하기
            tmp /= 10;
            count /= 10;
        }

        if(number == result)
            System.out.println( number + "는 회문수 입니다.");
        else
            System.out.println( number + "는 회문수가 아닙니다.");
    }
}
