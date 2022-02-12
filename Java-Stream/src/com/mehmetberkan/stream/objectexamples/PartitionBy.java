package com.mehmetberkan.stream.objectexamples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionBy {
    public static Map<Boolean , List<Person>> partitionAdults(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(person -> person.getAge() >= 18, Collectors.toList()));
    }
}
