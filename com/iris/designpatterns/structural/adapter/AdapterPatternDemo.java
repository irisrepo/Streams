package com.iris.designpatterns.structural.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
   Creditcard targetinteface = new BankCustomerDetails();
   targetinteface.getBankAccountDetails();
   System.out.println(targetinteface.getCardDetails());
    }
}
