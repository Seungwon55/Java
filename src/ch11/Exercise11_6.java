package ch11;

import java.util.*;

public class Exercise11_6 {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Student && o2 instanceof Student) {
                    Student s1 = (Student) o1;
                    Student s2 = (Student) o2;

                    return (int)(s1.getAverage() - s2.getAverage());
                }
                return -1;
            }
        });

        set.add(new Student("홍길동", 1,1,100,100,100));
        set.add(new Student("남궁성", 1,2,90,70,80));
        set.add(new Student("김자바", 1,3,80,80,90));
        set.add(new Student("이자바", 1,4,70,90,70));
        set.add(new Student("안자바", 1,5,60,100,80));

        Iterator<Student> it = set.iterator();

        while (it.hasNext())
            System.out.println(it.next());

        System.out.println("[61~70] : " + getGroupCount(set, 60, 70));
        System.out.println("[71~80] : " + getGroupCount(set, 70, 80));
        System.out.println("[81~90] : " + getGroupCount(set, 80, 90));
        System.out.println("[91~100] : " + getGroupCount(set, 90, 100));
    }

    static int getGroupCount(TreeSet<Student> tset, int from, int to) {
        int count = 0;
        Iterator<Student> it = tset.iterator();


        // while문 it가 가지고 있을 때
        while (it.hasNext()) {
            float average = it.next().getAverage();
            // it.next() -> Student => it.next().getAverage()가 60이상 70미만일 때
            if (average >= from && average <= to)
                count++;
        }

        return count;
    }
}

