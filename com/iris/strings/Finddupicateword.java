package com.iris.strings;

import java.util.*;
import java.util.stream.Collectors;

public class Finddupicateword {
    public static void main(String[] args) {
        String[] strarray= {"abc", "dfr", "hrg", "ddh", "abc","hrg"};
        List<String> words= Arrays.asList(strarray);
        Map<Object, Long> countmap = words.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
        Set<Object> wordsSet = countmap.
                entrySet()
                .stream().filter(entry -> entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println(wordsSet);
    }
}
