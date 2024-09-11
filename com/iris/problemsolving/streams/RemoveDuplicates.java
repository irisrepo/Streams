package com.iris.problemsolving.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Hello world";
        String removedduplicates = str.chars()
                .distinct()  // Remove duplicates
                .mapToObj(c -> String.valueOf((char) c))  // Convert back to character string
                .collect(Collectors.joining());
        System.out.println(removedduplicates);



    }
}
