package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise11_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> kyo = new ArrayList<>();
        ArrayList<Integer> cha = new ArrayList<>();
        ArrayList<Integer> hap = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            list1.add(i);
        }
        for (int i = 3; i <= 6; i++) {
            list2.add(i);
        }

        cha.addAll(list1);
        cha.removeAll(list2);

        kyo.addAll(list1);
        kyo.retainAll(list2);

        /*Iterator<Integer> it = list1.iterator();

        while (it.hasNext()) {
            Integer next = it.next();
            if (list2.contains(next))
                kyo.add(next);
            else {
                cha.add(next);
                hap.add(next);
            }
        }

        // hap에 list2 복사
        hap.addAll(list2);*/

        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println("kyo : " + kyo);
        System.out.println("cha : " + cha);
        System.out.println("hap : " + hap);
    }
}
