package com.mehmetberkan.arrays;

import java.util.Arrays;

public class Fill {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7};

        Arrays.fill(numbers,88);

        for(Integer number : numbers) {
            System.out.println(number);
        }
    }
}
