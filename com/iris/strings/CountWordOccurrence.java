package com.iris.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class
CountWordOccurrence {
    public static void main(String[] args) {
        //just count
        String str  = "java is a programming";
        long count = Arrays.stream(str.split("\\s+")).count();
        System.out.println("count: " + count);

        //Each word printing with occurrence
        Map<String,Long> countoccurences = Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(countoccurences);

        //Word pccureence
        String[] words = {"Apple", "Banana", "Apple","Cherry", "Apple","guava", "orange"};
        Map<String, Long> wordoccurences = Arrays.stream(words).collect(Collectors.groupingBy(word -> word ,Collectors.counting()));
        System.out.println(wordoccurences);
    }
}
