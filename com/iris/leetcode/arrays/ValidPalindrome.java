package com.iris.leetcode.arrays;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // Two pointers approach: one from the start and one from the end
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Move the left pointer until it points to an alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move the right pointer until it points to an alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // Compare the characters after converting them to lowercase
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true; // If all characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        // Example 1
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Is palindrome: " + solution.isPalindrome(s1)); // Output: true

        // Example 2
        String s2 = "race a car";
        System.out.println("Is palindrome: " + solution.isPalindrome(s2)); // Output: false

        // Example 3
        String s3 = " ";
        System.out.println("Is palindrome: " + solution.isPalindrome(s3)); // Output: true
    }
}
   /* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

        Given a string s, return true if it is a palindrome, or false otherwise.



        Example 1:

        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.
        Example 2:

        Input: s = "race a car"
        Output: false
        Explanation: "raceacar" is not a palindrome.
        Example 3:

        Input: s = " "
        Output: true
        Explanation: s is an empty string "" after removing non-alphanumeric characters.
        Since an empty string reads the same forward and backward, it is a palindrome.
 */