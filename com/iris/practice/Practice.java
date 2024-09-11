package com.iris.practice;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class Practice {
    public static void main(String[] args) {
        String str = "aaaabbcioo";
        //System.out.println(getFirstCharacter(str));
        //Remove duplicates form string
       String removedduplicates = str.chars()
               .distinct()  // Remove duplicates
               .mapToObj(c -> String.valueOf((char) c))  // Convert back to character string
               .collect(Collectors.joining());
       System.out.println(removedduplicates);

    }
    //GetFirst nonrepeacted characheter
    public static char getFirstCharacter(String str) {
        Arrays.sort(str.toCharArray());
        Map<Character,Integer> countMap = new HashMap<Character, Integer>();
        for(Character c :str.toCharArray()){
            countMap.put(c,countMap.getOrDefault(c,0)+1);
        }
        for(Character ch : str.toCharArray()){
            if(countMap.get(ch)==1){
                return ch;
            }
        }
        return '\0';
    }

}
