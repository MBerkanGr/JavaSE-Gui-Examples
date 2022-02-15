package com.mehmetberkan.string;

public class StartsWithEndsWith {
    public static void main(String[] args) {
        String s = "Mehmet Berkan Görel";
        boolean isStartsWith = s.startsWith("Meh");
        boolean isEndsWith = s.endsWith("el");

        System.out.println(isStartsWith);
        System.out.println(isEndsWith);
    }
}
