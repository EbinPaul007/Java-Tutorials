import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input;
        int min = 1;
        int max = 100;
        int guess = 50;
        System.out.println("Welcome to Number guess game \nYou guess a number from 1 to 100 and i will say that number");
        System.out.println("Enter ' higher ' if my guess is too  low");
        System.out.println("Enter ' lower ' if my guess is too  high");
        System.out.println("Enter ' correct ' if my guess is  correct");
        while (true) {
            System.out.println("I say your number is:  " + guess);
            System.out.println("Your response:  ");
            input = s.next();
            if (input.equals("higher")) {
                min = guess + 1;
            } else if (input.equals("lower")) {
                max = guess - 1;
            } else if (input.equals("correct")) {
                System.out.println(guess + "  I GOT IT ");
                break;
            }
            guess = (min + max) / 2;
            /*if your Number is 56 and system prints 15 you command higher so range becomes(16,100)
             then the system prints 16 you command lower instead of higher so range becomes(16,15)*/
            if (min == max + 1) {
                System.out.println("\nThat's not possible. Let's try again.");
                min = 1;
                max = 100;
                guess = 50;
            }
        }
    }
}