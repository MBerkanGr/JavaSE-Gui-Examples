package com.mehmetberkan.stream.objectexamples;

import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    public static String namesToString(List<Person> people) {
        return "Names : " +
                people.stream()
                    .map(person -> person.getName())
                    .reduce((i,sum) -> i + " ," + sum)
                    .orElse("") +
                ".";
    }

    public static String namesToString2(List<Person> people) {
        return  "Names : " +
                people.stream()
                    .map(person -> person.getName())
                    .collect(Collectors.joining(" ,")) +
                ".";
    }
}
