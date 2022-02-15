package com.mehmetberkan.string;

public class RegionMatches {
    public static void main(String[] args) {
        String s = "Mehmet Berkan Görel";
        String s1 = "Görel Mehmet Berkan";

        boolean result = s.regionMatches(7,s1,13,0);
        System.out.println(result);
    }
}
