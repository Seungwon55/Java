package ch4;

public class Exercise4_13 {
    public static void main(String[] args) {
        String value = "1234";
        char ch = ' ';
        boolean isNumber = true;

        for(int i=0; i < value.length(); i++) {
            ch = value.charAt(i);
            if (ch <= '0' || ch >= '9') {
                isNumber = false;
            }
        }

        if (isNumber) {
            System.out.println(value+"는 숫자입니다.");
        } else {
            System.out.println(value+"는 숫자가 아닙니다.");
        }

    }
}
