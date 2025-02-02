package ch9;

public class Exercise9_10 {
    public static void main(String[] args) {
        String str = "가나다";

        System.out.println(format(str, 7, 0));
        System.out.println(format(str, 7, 1));
        System.out.println(format(str, 7, 2));
    }

    static String format(String str, int length, int alignment) {
        StringBuffer sb = new StringBuffer(length);

        for (int i = 0; i < alignment; i++) {
            sb.append(" ");
        }
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }

        return new String(sb);
    }
}
