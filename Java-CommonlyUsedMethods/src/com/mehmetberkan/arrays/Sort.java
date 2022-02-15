package com.mehmetberkan.arrays;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] numbers = {10,5,18,2,14};

        Arrays.sort(numbers);

        for(Integer number : numbers) {
            System.out.println(number);
        }
    }
}
