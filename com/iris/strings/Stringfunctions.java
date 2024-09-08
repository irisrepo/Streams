package com.iris.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Stringfunctions {
    public static void main(String[] args) {
        //charAt()
        String name = "John";
        char firstLetter = name.charAt(0); // firstLetter will be 'J'
        char secondLetter = name.charAt(1);// second letter will be 'o'
        //   System.out.println(firstLetter + " " + secondLetter);
        //trim()
        String message = " Hell o World ";
        String trimmedMessage = message.trim(); // trimmedMessage will be "Hello World"
        // System.out.println(trimmedMessage);

        //search operations
        String sentence = "The quick brown fox jumps over the lazy dog.";
        int index = sentence.indexOf("fox"); // index will be 4
        System.out.println(index);

        //Checking if string starts with another:
        String path = "/usr/local/bin";
        boolean isSystemPath = path.startsWith("/usr"); // isSystemPath will be true

        //Checking string equality (ignoring case):
        String username1 = "johnDoe";
        String username2 = "JohnDoe";
        boolean areEqual = username1.equalsIgnoreCase(username2); // areEqual will be true

        //Comparing alphabetical order:
        String word1 = "apple";
        String word2 = "banana";
        int comparison = word1.compareTo(word2); // comparison will be negative (apple comes before banana alphabetically)

        //Extracting characters to an array:
        String greeting = "Good morning!";
        char[] chars = greeting.toCharArray(); // chars will contain an array of characters in "Good morning!"

        //Splitting string by delimiter:
        String csvLine = "Name,Age,City";
        String[] data = csvLine.split(","); // data will be an array containing "Name", "Age", and "City"

        //Replacing specific characters:
        String phoneNumber = "(555) 123-4567";
        String formattedNumber = phoneNumber.replace("-", ""); // formattedNumber will be "(555)1234567"
        FunctionHelper fh = new FunctionHelper();
        //  fh.countoccurrence("Photosynthesised");

        Map<Character, Integer> charCountMap = fh.countwordoccurrence("Willkommen");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            //     System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " times");
        }
        char result = fh.getFirstNonRepeated("suresh");
        if (result != '\0') {
            System.out.println("First nonrepeated charatce " + result);
        } else {
            System.out.println("All are repeated " + result);
        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String sub = scanner.nextLine();

        long count = str.chars()
                .filter(c -> c == sub.charAt(0))
                .mapToObj(c -> str.substring(str.indexOf(c)))
                .filter(s -> s.startsWith(sub))
                .count();

        System.out.println("The substring '" + sub + "' occurs " + count + " times in '" + str + "'");

    }


}

