import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int tS = 0;//total Score
        int roundsPlayed = 0;

        while (true) {
            int numberToGuess = random.nextInt(100) + 1; 
            int a = 0;//attempts
            int mA = 10;//max attempts
            boolean guessedCorrectly = false;

            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("You have " + mA + " attempts to guess it.");

            while (a< mA && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                a++;

                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    guessedCorrectly = true;
                    System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + a+ " attempts.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The number was " + numberToGuess + ".");
            }

            int score = Math.max(0, 10 - a);
            tS += score;
            roundsPlayed++;

            System.out.println("Your score for this round: " + score);
            System.out.println("Total score: " + tS);

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thanks for playing! You played " + roundsPlayed + " rounds with a total score of " + tS + ".");
        scanner.close();
    }
}

