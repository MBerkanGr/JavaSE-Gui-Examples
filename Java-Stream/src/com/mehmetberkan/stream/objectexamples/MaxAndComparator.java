package com.mehmetberkan.stream.objectexamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndComparator {
    public static void main(String[] args) {
        List people = Arrays.asList(new Person("Mehmet",56), new Person("Berkan",22));

        System.out.println(getOlderPerson(people).getName());
    }

    public static Person getOlderPerson(List<Person> people) {
        return people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(null);
    }
}
