package com.mehmetberkan.string;

public class CompareTo {
    public static void main(String[] args) {
        //Comparison by ASCII values

        String s = "Berkan";
        String s1 = "Berkay";
        int result = s.compareTo(s1);

        if(result > 0) {
            System.out.println(s);
        } else if(result < 0) {
            System.out.println(s1);
        } else {
            System.out.println("same");
        }
    }
}
