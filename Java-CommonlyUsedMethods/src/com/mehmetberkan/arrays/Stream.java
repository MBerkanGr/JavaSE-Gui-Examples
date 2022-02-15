package com.mehmetberkan.arrays;

import java.util.Arrays;

public class Stream {
    public static void main(String[] args) {
        Integer[] numbers = {1,8,2,4,5};

        long count = Arrays.stream(numbers).count();
        System.out.println("Numbers array size : " + count);
    }
}
