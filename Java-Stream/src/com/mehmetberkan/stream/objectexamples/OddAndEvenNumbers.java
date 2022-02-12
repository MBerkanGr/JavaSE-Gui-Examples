package com.mehmetberkan.stream.objectexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddAndEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,8,6,3,9,4,5,15,225);
        System.out.println(getString(list));
    }

    public static String getString(List<Integer> list) {
        return list.stream()
                .map(i -> {
                    String s = "";
                    if(i % 2 == 0) {
                        s = i + "e";
                    } else {
                        s = i+"o";
                    }
                    return s;
                }).collect(Collectors.joining(","));
    }
}
