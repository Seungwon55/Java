package ch10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex10_7 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        LocalDate date1 = date.withMonth(6);
        LocalDate date2 = date1.plusDays(20);

        System.out.println(toString(date2));
        System.out.println(toString(date1) + "이 " + toString(date2) + "보다 이후입니까?" + date1.isAfter(date2));

        String format = DateTimeFormatter.ISO_LOCAL_DATE.format(date2);

        System.out.println("포맷된 결과 : " + format);
    }

    static String toString(LocalDate date) {
        return String.format("%d년 %d월 %d일", date.getYear(), date.getMonthValue(), date.getDayOfMonth());
    }
}
