package com.mehmetberkan.stream;

import java.util.Arrays;
import java.util.List;

public class LetterCount {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ali","Mehmet","Berkan","Abdülkadir","Nihan");

        System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive(list));
    }

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(List<String> list) {
        return list.stream()
                .filter(name -> name.length()>5)
                .mapToInt(name -> name.length())
                .sum();
    }
}
