package ch10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_6 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        DateFormat df1 = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();

        try {
            System.out.println("오늘의 날짜/시간 : " + df.format(date));
            Date d = df1.parse("2025년 1월 27일");
            System.out.println(df2.format(d));
        } catch (ParseException e) {}
    }
}
