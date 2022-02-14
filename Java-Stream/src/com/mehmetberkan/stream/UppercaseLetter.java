package com.mehmetberkan.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UppercaseLetter {
    public static void main(String[] args) {
        System.out.println(getUppercaseLetterCount("MeHmeT bERkAn GoReL"));
    }

    public static int getUppercaseLetterCount(String s) {
        char[] chars = s.toCharArray();
        Stream<Character> cStream = IntStream.range(0, chars.length).mapToObj(i -> chars[i]);
        return (int) cStream.filter(i -> i >= 65 && i <= 90)
                .count();
    }
}
