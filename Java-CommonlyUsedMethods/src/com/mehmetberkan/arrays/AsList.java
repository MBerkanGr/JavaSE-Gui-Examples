package com.mehmetberkan.arrays;

import java.util.Arrays;
import java.util.List;

public class AsList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,6,8);

        list.forEach(System.out::println);
    }
}
