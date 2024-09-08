package com.iris.problemsolving;

public class PalindromeCheck {
    public static boolean  isPalindrome(String str) {

    String reverse = new StringBuilder(str).reverse().toString();

    return reverse.equalsIgnoreCase(str);
    }

    public static void main(String[] args) {

     System.out.println(isPalindrome("tenet"));
     System.out.println(String.valueOf(121));

    }


}
