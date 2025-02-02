package ch9;

public class Exercise9_9 {
    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5) -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
        System.out.println("(1 2    3  4\t5) -> " + delChar("(1 2    3  4\t5)", " \t"));
    }

    static String delChar(String src, String delCh) {
        // StringBuffer 만들기
        StringBuffer sb = new StringBuffer(src.length());
        // src을 나눠 delCh에 있는지 확인
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            // 있으면 StringBuffer에 추가 X 없으면 추가
            if (delCh.indexOf(ch) == -1)
                sb.append(ch);
        }

        return new String(sb);
    }
}
