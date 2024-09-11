package com.iris.strings;

public class JavaDebug {
    public static void main(String[] args) {
        String str = "Java is a programming language and Java is also a platform";
      char ch[] =str.toCharArray();
      //System.out.println(ch);

      String str2 = "Java is a programming";
      FunctionHelper stringfunctions = new FunctionHelper();
      System.out.println(stringfunctions.getFirstNonRepeated(str2));
    }
}
