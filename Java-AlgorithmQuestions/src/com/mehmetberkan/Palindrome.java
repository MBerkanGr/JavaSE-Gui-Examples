package com.mehmetberkan;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("makam"));
        System.out.println(isPalindrome2("makam"));

        System.out.println(isPalindrome("mehmet"));
        System.out.println(isPalindrome2("berkan"));
    }

    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int length = s.length()-1;
        for(int i = 0; i < s.length()/2; i++) {
            if(chars[i] != chars[length-i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        String reverseString = "";
        int length = s.length()-1;
        for(int i = length; i >= 0; i--) {
            reverseString += s.charAt(i);
        }

        if(reverseString.equals(s)) {
            return true;
        }
        return false;
    }
}
