package ch14;

import java.util.Arrays;
import java.util.function.Function;

public class Exercise14_5 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bb", "c", "dddd"};

        int sum = Arrays.stream(strArr).mapToInt(String::length).sum();

        System.out.println("sum : " + sum);
    }
}
