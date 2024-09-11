package com.iris.designpatterns.structural.adapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomerDetails extends BankDetails implements Creditcard {

    public void getBankAccountDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the account holder name :");
            String customername = br.readLine();
            System.out.print("\n");

            System.out.print("Enter the account number:");
            String accno = br.readLine();
            System.out.print("\n");

            System.out.print("Enter the bank name :");
            String bankname = br.readLine();

            setName(customername);
            setBankname(bankname);
            setAccountNumber(accno);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @Override
    public String getCardDetails() {
        String name = getName();
        String bankname = getBankname();
        String accountNumber = getAccountNumber();
         return ("The Account number "+accountNumber+" of "+name+" in "+accountNumber+ " bank is valid and authenticated for issuing the credit card. ");
    }
}
