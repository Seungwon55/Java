package ch10;

import java.util.Calendar;

public class Ex10_4 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();

        date.set(2019, 7, 31);

        System.out.println(toString(date));

        System.out.println("= 1일 후 =");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));

        System.out.println("= 30일 후(roll) =");
        date.roll(Calendar.DATE, 30);
        System.out.println(toString(date));

        System.out.println("= 30일 후(add) =");
        date.add(Calendar.DATE, 30);
        System.out.println(toString(date));
    }

    static String toString(Calendar date) {
        return String.format("%d년 %d월 %d일", date.get(Calendar.YEAR), date.get(Calendar.MONTH) + 1, date.get(Calendar.DATE));
    }
}
