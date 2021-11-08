import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        System.out.print("Lets know your luck \nThis is a number guessing game \nGuess any number between 1 and 101 :");
        int randomnumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("\nYour guess:  ");
            guess = input.nextInt();
                if (guess < randomnumber) {
                    System.out.println("Number is Lower");


                } else if (guess > randomnumber) {
                    System.out.println("Number is Higher");


                } else if(guess == randomnumber ) {
                    System.out.println("YOU ARE LUCKY \n YOU GUSSED THE CORRECT NUMBER ");
                    break;

                }
            } while (guess != randomnumber);


        }
    }
