package com.example;

import java.util.Scanner;

public class Constr {
    Scanner d= new Scanner(System.in);
    int a= d.nextInt();
    int c= d.nextInt();

    Constr(int a,int c){
        System.out.println(a+c);
    }

}
