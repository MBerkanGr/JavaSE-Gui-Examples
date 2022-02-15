package com.mehmetberkan.string;

public class ToCharArray {
    public static void main(String[] args) {
        String s = "Mehmet Berkan Görel";
        char[] chars = s.toCharArray();

        for(Character i : chars) {
            System.out.println(i);
        }
    }
}
