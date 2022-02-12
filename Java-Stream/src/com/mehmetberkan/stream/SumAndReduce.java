package com.mehmetberkan.stream;

import java.util.Arrays;
import java.util.List;

public class SumAndReduce {
    public static void main(String[] args) {
        List list = Arrays.asList(2,4,6,8,12);

        System.out.println(sum(list));
    }

    public static int sum(List<Integer> list) {
        return list.stream()
                .reduce((i,sum) -> i+sum)
                .orElse(0);
    }
}
