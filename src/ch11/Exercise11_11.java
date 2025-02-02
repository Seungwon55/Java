package ch11;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Exercise11_11 {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3, true);
        SutdaCard c2 = new SutdaCard(3, true);
        SutdaCard c3 = new SutdaCard(1, true);

        Set<SutdaCard> set = new HashSet<>();
        set.add(c1);
        set.add(c2);
        set.add(c3);

        System.out.println(set);
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SutdaCard)
            return num == ((SutdaCard) obj).num && isKwang == ((SutdaCard) obj).isKwang;

        return false;
    }

    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, isKwang);
    }
}