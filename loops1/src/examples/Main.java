package examples;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        String passw;
        do{
            System.out.println("enter your password");
            passw= s.next();
            if(!passw.equals("hello")){
                System.out.println("acces denied");
            }
        }while(!passw.equals("hello"));

        System.out.println( "access granted");
            System.out.println("hai you are welcome");
        }
    }

