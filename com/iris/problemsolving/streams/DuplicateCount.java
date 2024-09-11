package com.iris.problemsolving.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;



public class DuplicateCount {
    public static void main(String[] args) {
        String str = "helloworld";
        Map<Character,Long> countMap = new HashMap<Character,Long>();
        countMap = str.chars().mapToObj(ch -> ((char)ch)).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
       countMap.entrySet().stream().filter(entry -> entry.getValue()>1).forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }
}
