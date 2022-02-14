package com.mehmetberkan;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Mehmet Berkan Görel"));
    }

    public static String reverse(String s) {
        String result = "";
        for(int i = s.length()-1; i >= 0; --i) {
            result = result + s.charAt(i);
        }
        return result;
    }
}
