package com.mehmetberkan;

public class StringLength {
    public static void main(String[] args) {
        System.out.println(length("MehmetBerkan"));
    }

    public static int length(String s) {
        int length = 0;
        char[] chars = s.toCharArray();

        for(Character c : chars) {
            length++;
        }
        return length;
    }
}
