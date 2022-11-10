import java.util.Scanner;

public class secret_number_game {
    public static void main(String[] args) {

        // Asking user what they think the secret code is
        System.out.println("Guess the secret number!");

        // Now collecting their guess
        Scanner reader = new Scanner(System.in);
                int SecretNumberGuess = reader.nextInt();

        // Prints out user guess for user to see
        System.out.println("Your guess is: " + SecretNumberGuess);

        // Defining correct secret number
        int SecretNumber = 33;

        // setting up if
        if ((SecretNumberGuess) == (SecretNumber)) {
            System.out.println("CORRECT! YOU'RE A WINNER");
        }

        else if (SecretNumberGuess < SecretNumber) {
            System.out.println("You're lower than the secret number, try again!")
            ;
        }
        else if (SecretNumberGuess > SecretNumber) {
            System.out.println("You're higher than the secret number, try again!");
        }


        }

    }
}
