package com.mehmetberkan.string;

public class Split {
    public static void main(String[] args) {
        String s = "Mehmet Berkan Görel";
        String[] array = s.split(" ");
        for(String i : array) {
            System.out.println(i);
        }

        String s1 = "aaaa,bbbb,cccc,dddd";
        String[] array1 = s1.split(",");
        for(String i : array1) {
            System.out.println(i);
        }
    }
}
