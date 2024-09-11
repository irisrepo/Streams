package com.iris.arrays;

import java.util.Arrays;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] num ={10,55,45,65,11,21};
        Arrays.sort(num);
        System.out.println("HighestNumber"+num[num.length-1]);
        System.out.println("SecondHighestNumber"+num[num.length-2]);
    }
}
