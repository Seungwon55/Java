package ch10;

import java.util.Calendar;

public class Ex10_2 {
    public static void main(String[] args) {
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();
        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};

        date1.set(2025, 5, 27);
        System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고, ");
        System.out.println("오늘은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");

        long diff = (date1.getTimeInMillis() - date2.getTimeInMillis())/1000;

        System.out.println("오늘부터 date1까지 " + diff + "초가 지났습니다.");
        System.out.println("일로 계산하면 " + diff / (60*60*24) + "일입니다.");
    }

    static String toString(Calendar date) {
        return String.format("%d년 %d월 %d일 ", date.get(Calendar.YEAR), date.get(Calendar.MONTH) + 1, date.get(Calendar.DATE));
    }
}
