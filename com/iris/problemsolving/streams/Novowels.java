package com.iris.problemsolving.streams;

import java.util.stream.Collectors;

public class Novowels {
    public static void main(String[] args) {
        String noVowels = "example"
                .chars()
                .filter(ch -> !"aeiou".contains(String.valueOf((char) ch)))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(noVowels); // Output: xmpl

    }
}