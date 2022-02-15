package com.mehmetberkan.string;

public class Replace {
    public static void main(String[] args) {
        String s = "Mehmet Berkan Görel";
        String result = s.replace("e","a");
        System.out.println(result);

        result = s.replaceAll(" ","-");
        System.out.println(result);
    }
}
