import java.util.*;

public class numberGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the number Game");
        System.out.println("I've chosen a number between 1 and 100. tryy to guess it");

        do {
            System.out.println("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Try a higher number.");
            } else if (guess > secretNumber) {
                System.out.println("Try a lower number");
            } else {
                System.out.println("Congratulation!you guessed the number in " + attempts + " attempts.");
                break;
            }
        } while (true);
    }
}
