package com.iris.problemsolving.streams;

public class AnagramCheckerStreams {
    public static void main(String[] args) {
        System.out.println(anagramCheck("case","sace"));
    }

    public static boolean anagramCheck(String str1,String str2) {
        String sorted1 = str1.toLowerCase().chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        String sorted2 = str1.toLowerCase().chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

        return sorted1.equalsIgnoreCase(sorted2);
    }
}
