package com.mehmetberkan;

public class HighestCommonFactor {
    public static void main(String[] args) {
        System.out.println(getHCF(16,12));
    }

    public static int getHCF(int number1, int number2) {
        int hcf = 0;
        int smallest = Math.min(number1,number2);

        for(int i = 1; i <= smallest; i++) {
            if(number1 % i == 0 && number2 % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }
}
