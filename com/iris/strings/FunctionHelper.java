package com.iris.strings;

import java.util.HashMap;
import java.util.Map;

public class FunctionHelper {

    public  int countoccurrence(String name) {
        int count = 0;
        char ch = 'p';
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    //Count everyword occurrences
    public  Map<Character, Integer> countwordoccurrence(String name) {

        char[] charatcerarray = name.toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        for (char c : charatcerarray) {
            if (Character.isLetter(c)) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }
        return charCountMap;
    }
}
