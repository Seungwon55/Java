package ch10;

import java.util.Calendar;

public class Ex10_3 {
    public static void main(String[] args) {
        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();
        final int[] TIME_UNIT = {60*60, 60, 1};
        final String[] TIME_UNIT_NAME = {"시간 ", "분 ", "초"};

        time1.set(Calendar.HOUR_OF_DAY, 10);
        time1.set(Calendar.MINUTE, 20);
        time1.set(Calendar.SECOND, 30);
        time2.set(Calendar.HOUR_OF_DAY, 20);
        time2.set(Calendar.MINUTE, 30);
        time2.set(Calendar.SECOND, 10);

        System.out.println("time1 : " + toString(time1));
        System.out.println("time2 : " + toString(time2));

        long diff = (time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;

        System.out.println("time1과 time2의 차이는 " + diff + "초 입니다.");

        StringBuffer tmp = new StringBuffer();

        for (int i = 0; i < TIME_UNIT.length; i++) {
            long time = (diff / TIME_UNIT[i]);
            tmp.append(time + TIME_UNIT_NAME[i]);
            diff -= time * TIME_UNIT[i];
        }
        System.out.println("시분초로 변환하면 " + tmp + "입니다.");
    }

    static String toString(Calendar time) {
        return String.format(time.get(Calendar.HOUR_OF_DAY) + "시 " + time.get(Calendar.MINUTE) + "분 " + time.get(Calendar.SECOND) + "초");
    }
}
