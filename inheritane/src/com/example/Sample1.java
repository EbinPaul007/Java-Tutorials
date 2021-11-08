package com.example;

import java.util.Scanner;

public class Sample1 {
    Scanner f=new Scanner(System.in);


    int a= f.nextInt();
    int c= f.nextInt();

    void result(){

        System.out.println("result is");
        System.out.println(a+c);


    }
    public class Sample2 extends Sample1{
        int f;
        int d;
        void figure(){
            System.out.println(f-d);
        }

    }
}
