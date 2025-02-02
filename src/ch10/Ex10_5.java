package ch10;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex10_5 {
    public static void main(String[] args) throws ParseException {
        DecimalFormat df1 = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");
        String str = "1,234,567.89";

        System.out.print(str + " -> ");

        Number number = df1.parse(str);
        double d = number.doubleValue();
        System.out.print(d + " -> ");

        String format = df2.format(d);
        System.out.print(format);
    }
}
