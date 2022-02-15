package com.mehmetberkan.string;

public class Concat {
    public static void main(String[] args) {
        String s = "Mehmet Berkan";
        String s1 = " Görel";

        String combine = s.concat(s1);
        System.out.println(combine);

        String combine2 = s + s1;
        System.out.println(combine2);
    }
}
