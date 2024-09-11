package com.iris.arrays;

import java.util.Arrays;

public class FindMedian {
    public static void main(String[] args) {
       int arr[]={1,3,5,6,4,7};
       System.out.println(findMedian(arr));
    }
    public static float findMedian(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        float median =1;
        if(n%2!=0){
            median =arr[n/2];
        }
        else{
            int mid1 = arr[n/2];
            int mid2 = arr[(n/2)-1];
            median = (mid1+mid2)/2;

        }
        return median;
    }
}
