package com.mehmetberkan.arrays;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        int[] numbers1 = {1,2,3};
        int[] numbers2 = {2,1,3};

        boolean result = Arrays.equals(numbers,numbers1);
        System.out.println(result);

        boolean result1 = Arrays.equals(numbers,numbers2);
        System.out.println(result1);
    }
}
