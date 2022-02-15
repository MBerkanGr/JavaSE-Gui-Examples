package com.mehmetberkan.arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = { 10,20,33,55,88};

        int result = Arrays.binarySearch(numbers,55);
        System.out.println("Found at index = " + result);
    }
}
