import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Number guess game \nYou guess a number from 1 to 100 and i will say that number");
        System.out.println("Enter ' higher ' if my guess is too  low");
        System.out.println("Enter ' lower ' if my guess is too  high");
        System.out.println("Enter ' correct ' if my guess is  correct");

        Scanner scanner = new Scanner(System.in);
        String input;

        int min = 1;
        int max = 100;

        while (true) {
            int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println("\nI guess " + randomNumber );
            System.out.print("Your response: ");
            input = scanner.next();

            if (input.equals("higher")) {
                min = randomNumber + 1;
            } else if (input.equals("lower")) {
                max = randomNumber - 1;
            } else if (input.equals("correct")) {
                System.out.println(randomNumber + "  I GOT IT ");
                break;
            }

            /*if your Number is 56 and system prints 15 you command higher so range becomes(16,100)
            then the system prints 16 you command lower instead of higher so range becomes(16,15)*/
            if (min == max + 1) {
                System.out.println("\nThat's not possible. Let's try again.");
                min = 1;
                max = 100;
            }
        }

    }
}
