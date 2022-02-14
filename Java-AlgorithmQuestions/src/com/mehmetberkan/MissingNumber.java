package com.mehmetberkan;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1,4,5,6,2};
        System.out.println(findMissingNumber(numbers));
        System.out.println(findMissingNumber2(numbers));
    }

    public static int findMissingNumber(int[] numbers) {
        int[] sortedArray = Arrays.stream(numbers).sorted().toArray();
        for(int i = 0; i < sortedArray.length-1; i++) {
            if(sortedArray[i]-sortedArray[i+1] != -1) {
                return sortedArray[i]+1;
            }
        }
        return 0;
    }

    public static int findMissingNumber2(int[] numbers) {
        int biggest = numbers[0];
        int smallest = numbers[0];

        for(Integer i : numbers) {
            if(biggest < i) {
                biggest = i;
            }
        }
        for(Integer i : numbers) {
            if(smallest > i) {
                smallest = i;
            }
        }

        int mustBe = 0;
        int sum = 0;

        for(int i = smallest; i <= biggest; i++) {
            mustBe += i;
        }

        for(Integer i : numbers) {
            sum += i;
        }

        return mustBe - sum;
    }
}
