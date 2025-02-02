package ch14;

import java.util.Arrays;
import java.util.OptionalInt;

public class Exercise14_6 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bb", "c", "dddd"};

        OptionalInt max = Arrays.stream(strArr).mapToInt(String::length).max();

        System.out.println(max.orElse(0));
    }
}
