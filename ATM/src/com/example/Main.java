package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("WELCOME TO FEDERAL ATM");
        System.out.println("enter pin");
        Scanner s= new Scanner(System.in);
         int a=s.nextInt();
        System.out.println("withdrawal");
        System.out.println( " amount should e a multiple of 100 or 500");
        System.out.println("enter amount");
        int c=s.nextInt();
        System.out.println("please wait your transaction is on proccess");
        System.out.println(" collect your money");
        System.out.println("thank you for using federal atm service");



    }
}
