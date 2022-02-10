package com.mehmetberkan.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindTwoBiggestNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,213,1,322);

        findTwoBiggestNumbers(list);
    }

    public static void findTwoBiggestNumbers(List<Integer> list) {
        List<Integer> results = list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .collect(Collectors.toList());

        results.forEach(System.out::println);
    }
}
