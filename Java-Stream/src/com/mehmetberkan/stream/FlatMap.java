package com.mehmetberkan.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("D", "E", "F");

        List<List<String>> listOfListofStrings =
                Arrays.asList(list1, list2);

        flatMap(listOfListofStrings).forEach(System.out::println);
    }

    /*
        {
            {A , B , C}
            {D , E , F}
        }

        FlatMap

        {A , B , C , D , E , F}
     */

    public static List<String> flatMap(List<List<String>> list) {
        return list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
