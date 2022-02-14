package com.mehmetberkan;

public class DuplicateCharacters {
    public static void main(String[] args) {
        getDuplicateCharacters("Berrkkann");
    }

    public static void getDuplicateCharacters(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = i+1; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    count++;
                    System.out.println(s.charAt(i));
                }
            }
        }
        System.out.println("Count : " + count);
    }
}
