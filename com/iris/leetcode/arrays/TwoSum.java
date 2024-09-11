package com.iris.leetcode.arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            // Create a HashMap to store the indices of the numbers we've encountered
            Map<Integer, Integer> map = new HashMap<>();

            // Loop through the array
            for (int i = 0; i < nums.length; i++) {
                // Calculate the complement by subtracting the current number from the target
                int complement = target - nums[i];

                // If the complement is found in the map, return the indices
                if (map.containsKey(complement)) {
                    return new int[] { map.get(complement), i };
                }

                // Otherwise, store the current number and its index in the map
                map.put(nums[i], i);
            }

            // If no solution is found, return an empty array (though the problem guarantees a solution exists)
            return new int[] {};
        }

        public static void main(String[] args) {
            TwoSum solution = new TwoSum();

            // Test case 1
            int[] nums1 = {2, 7, 11, 15};
            int target1 = 9;
            int[] result1 = solution.twoSum(nums1, target1);
            System.out.println("Indices: " + result1[0] + ", " + result1[1]); // Output: [0, 1]

            // Test case 2
            int[] nums2 = {3, 2, 4};
            int target2 = 6;
            int[] result2 = solution.twoSum(nums2, target2);
            System.out.println("Indices: " + result2[0] + ", " + result2[1]); // Output: [1, 2]

            // Test case 3
            int[] nums3 = {3, 3};
            int target3 = 6;
            int[] result3 = solution.twoSum(nums3, target3);
            System.out.println("Indices: " + result3[0] + ", " + result3[1]); // Output: [0, 1]
        }
    }


