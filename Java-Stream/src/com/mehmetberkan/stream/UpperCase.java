package com.mehmetberkan.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        List list = Arrays.asList("mehmet","berkan","görel");

        toUpperCase(list).forEach(System.out::println);
    }

    public static List<String> toUpperCase(List<String> list) {
        return list.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
    }
}
