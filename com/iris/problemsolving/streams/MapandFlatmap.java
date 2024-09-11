package com.iris.problemsolving.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapandFlatmap {
    public static void main(String[] args) {

       /* Purpose: Transforms each element of a stream into a new element.
          Output: Returns a new stream where each element is the result of applying a function to the corresponding element in the input stream.  
          One-to-one mapping: For each input element, there's exactly one output element.*/
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        List<Integer> lengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(lengths);

        /*flatMap
        Purpose: Transforms each element of a stream into a stream of elements, then flattens the resulting streams into a single stream.
        Output: Returns a new stream that is the concatenation of all the streams produced by the mapping function.
                One-to-many mapping: For each input element, there can be zero or more output elements*/

        List<List<String>> nestedLists = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d", "e")
        );
        List<String> flattenedList = nestedLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flattenedList);
    }
}
