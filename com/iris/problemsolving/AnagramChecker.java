package com.iris.problemsolving;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
    public static void main(String[] args) {
   System.out.println(isAnagram("case","sace"));
    }
    public static boolean isAnagram(String str1,String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length()!= str2.length()){
            return false;
        }

        Map<Character,Integer> map1 = getCharacterCount(str1);
        Map<Character,Integer> map2 = getCharacterCount(str2);


        return map1.equals(map2);
    }
    public static  Map<Character,Integer> getCharacterCount(String str){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(Character c: str.toCharArray()){
           map.put(c,map.getOrDefault(c,0)+1);
        }
        return map;
    }
}
