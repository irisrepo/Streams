package com.iris.problemsolving;

import java.util.Scanner;

public class FactorialCaluculator {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();
        System.out.println("FactorialIterative"+ factorialIterative(number));
        System.out.println("Factorialrecursive"+ factorialRecursive(number));
        scanner.close();

    }
    //Iterative Factorial
    public static long   factorialIterative(int number){
        long result = 1;

        for(int i = 1; i <= number; i++){
             result = result * i;
        }
        return result ;
    }
    //Recursive Factorial
    public  static long factorialRecursive(int number){

        if(number == 0 || number ==1) {
            return 1;
        }
        return number*factorialRecursive(number -1);
    }
}
