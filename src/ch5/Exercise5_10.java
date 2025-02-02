package ch5;

public class Exercise5_10 {
    public static void main(String[] args) {
        char[] abcCode =
                {'`','~','!','@','#','$','%','^','&','*',
                        '(',')','-','_','+','=','|','[',']','{',
                        '}',';',':',',','.','/'};

        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
        String src = "abc123";
        String result = "";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);

            if (ch >= 48 && ch <= 57) {
                result += numCode[ch - 48];
            }
            else {
                result += abcCode[ch - 97];
            }
        }


        System.out.println("src : " + src);
        System.out.println("result : " + result);
    }
}
