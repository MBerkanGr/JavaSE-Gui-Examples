package com.mehmetberkan.string;

public class GetChars {
    public static void main(String[] args) {
        char[] chars = new char[5];
        String s = "Ayvalık";
        s.getChars(2,7,chars,0);
        System.out.println(chars);
    }
}
