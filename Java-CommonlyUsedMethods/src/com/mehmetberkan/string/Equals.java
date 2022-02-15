package com.mehmetberkan.string;

public class Equals {
    public static void main(String[] args) {
        String s = "Mehmet";
        String s1 = "Berkan";

        System.out.println(s.equals(s1));
        System.out.println(s1.equals("Berkan"));

        System.out.println(s.equalsIgnoreCase("mehmet"));
    }
}
