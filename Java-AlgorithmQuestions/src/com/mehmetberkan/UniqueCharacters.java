package com.mehmetberkan;

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(isUnique("Berkan"));
        System.out.println(isUnique("Mehmet"));
    }

    public static boolean isUnique(String s1) {
        for(int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if(s1.lastIndexOf(c) != s1.indexOf(c)) {
                return false;
            }
        }
        return true;
    }
}
