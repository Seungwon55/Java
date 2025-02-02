package ch9;

public class Exercise9_5 {
    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));
    }

    static int count(String src, String target) {
        int count = 0;
        int pos = 0;
        int targetLength = target.length();

        // while(true) 무한 반복문
        while (true) {
            // 찾은 위치를 pos에 저장한다.
            // 위치부터 시작해서 pos를 찾는다.
            pos = src.indexOf(target, pos + targetLength);

            if (pos == -1)
                break;
            else
                // scr에서 target을 찾고 count++ 한다.
                count++;
        }

        return count;
    }
}
