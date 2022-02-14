package com.mehmetberkan;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("Berkan","nkBrea"));
        System.out.println(isAnagram("Mehmet","Mehmes"));
    }

    public static boolean isAnagram(String word, String anagram) {
        if(word.length() != anagram.length()) {
            return false;
        }

        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = anagram.indexOf(c);
            if(index == -1)
                return false;
        }
        return true;
    }
}
