package com.mehmetberkan;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        int[] array = {1,3,2,5,4};
        System.out.println(getSecondLargestNumber(array));
    }

    public static int getSecondLargestNumber(int[] arrays) {
        int highest  = Integer.MIN_VALUE;
        int secondHighest  = Integer.MIN_VALUE;

        for(int i = 0; i < arrays.length; i++) {
            if(arrays[i] > highest) {
                secondHighest = highest;
                highest = arrays[i];
            } else if(secondHighest < arrays[i] && highest != arrays[i]) {
                secondHighest = arrays[i];
            }
        }
        return secondHighest;
    }
}
