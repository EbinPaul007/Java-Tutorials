package examples;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] guest = {"__", "__", "__", "__", "__", "__", "__", "__", "__", "__", "__", };
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter an opton");
            System.out.println("1 :VIEW GUEST LIST");
            System.out.println("2 :ADD GUEST ");
            System.out.println("3 :REMOVE GUEST");
            System.out.println("4 : EXIT");
            System.out.print("option:  ");
            int option = input.nextInt();

            if(option == 1){
                for (int i = 0; i < guest.length; i++) {
                    System.out.println(guest[i]==null ? "--":guest[i] );
                }
            }else if(option==2){
                for (int i = 0; i < guest.length; i++)
                    if(guest[i]== "__"){
                System.out.println("Enter the name");
                guest[i]=input.next();
                        break;}
            }
            else if(option == 4){
                System.out.println("exiting....");
                break;
            }else if(option==3){
                System.out.println("enter name to to delete");
                String name=input.next();
                for (int i = 0; i < guest.length; i++){
                    if(name.equals(guest[i])&&!name.equals(null)){
                        guest[i]=null;
                    }

                }
            }

        }while(true);


    }

}