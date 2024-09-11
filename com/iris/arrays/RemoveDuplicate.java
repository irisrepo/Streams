package com.iris.arrays;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        //Duplicate element
        int[] arr={2,2,5,7,7,9,23};
      Arrays.stream(arr).distinct().forEach(System.out::println);
      //find larget element
        int[] maxarr= {23,76,3,4,6,8};
       OptionalInt max= Arrays.stream(maxarr).sorted().max();
       System.out.println(max);
    }
}
