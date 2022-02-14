package com.mehmetberkan;

public class FindAllSubstringsOfString {
    public static void main(String[] args) {
        getAllSubstring("Berkan");
    }

    public static void getAllSubstring(String s) {
        for(int i = 0; i < s.length()+1; i++) {
            for(int j = i+1; j < s.length()+1; j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
