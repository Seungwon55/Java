package ch11;

import java.util.*;

public class Exercise11_9 {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();
        list.add(new Student2("김자바", 1,2,80,80,90));
        list.add(new Student2("홍길동", 1,3,100,100,100));
        list.add(new Student2("이자바", 2,1,70,90,70));
        list.add(new Student2("남궁성", 1,1,90,70,80));
        list.add(new Student2("안자바", 2,2,60,100,80));
        list.add(new Student2("서자바", 2,2,60,90,85));
        list.add(new Student2("최자바", 2,2,80,100,80));

        calculateSchoolRank(list);
        calculateClassRank(list);

        Iterator<Student2> it = list.iterator();

        while (it.hasNext())
            System.out.println(it.next());
    }

    static void calculateSchoolRank(List<Student2> list) {
        Collections.sort(list);

        int rank = 1; // 등수
        int beforeTotal = 300;

        // list.size만큼 for 문을 돌면서
        for (int i = 0; i < list.size(); i++) {
            Student2 st = list.get(i);
            // list.get(i).total(현재 총점)과 이전 총점 비교
            if (st.total == beforeTotal)
                st.schoolRank = rank;
            else {
                st.schoolRank = ++rank;
                beforeTotal = st.total;
            }
        }
    }

    static void calculateClassRank(List<Student2> list) {
        Collections.sort(list, new ClassTotalComparator());

        Student2 firstStu = list.get(0);
        int beforeBan = firstStu.ban;
        int beforeTotal = firstStu.total;
        int rank = 1;

        // list.size()만큼 돌면서
        for (int i = 0; i < list.size(); i++) {
            Student2 st = list.get(i);
            // 현재 반과 이전 반이 같다면 현재 총점과 이전 총점과 같은지 비교
            if (st.ban == beforeBan) {
                // 현재 총점과 이전 총점이 같다면 현재 반 등수에 rank 부여
                if (st.total == beforeTotal)
                    st.classRank = rank;
                // 다르다면 현재 총점에 ++rank 부여하고, 이전 총점에 현재 총점 넣기
                else {
                    st.classRank = ++rank;
                    beforeTotal = st.total;
                }
            }
            // 현재 반과 이전 반이 다르다면 이전 총점과 이전 반 rank 초기화
            else {
                beforeBan = st.ban;
                beforeTotal = st.total;
                rank = 1;
                st.classRank = rank;
            }
        }
    }
}

class Student2 implements Comparable<Student2> {
    String name;
    int ban;
    int no;
    int kor, eng, math;
    int total;
    int schoolRank;
    int classRank;

    public Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        total = getTotal();
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return Math.round(getTotal() / 3f * 10) / 10f;
    }

    @Override
    public String toString() {
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", "
                + getTotal() + ", " + getAverage() + ", " + schoolRank + ", " + classRank;
    }

    @Override
    public int compareTo(Student2 s) {
        return s.total - this.total;
    }
}

// 반 별 총점으로 내림차순 정렬한다.
class ClassTotalComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 s1, Student2 s2) {
        if (s1.ban != s2.ban)
            return s1.ban - s2.ban;

        return s2.total - s1.total;
    }
}