import java.util.Scanner;

public class guessGame {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String guess = "";
        int guessCount = 0;
        int guessLimit = 3;
        int guessShown = 3;

        System.out.println("___________________________");
        System.out.println("Welcome to guesing game");
        System.out.println("___________________________");
        System.out.print("What is your word? ");
        String secretWord = input.nextLine();
        
        System.out.println("___________________________");
        System.out.println("You have 3 tries");
        System.out.println("___________________________");

        while (!guess.equals(secretWord) && guessCount<guessLimit) {
            guessShown--;


            System.out.print("Enter a guess: ");
            guess = input.nextLine();
            System.out.println("___________________________");
            if (!guess.equals(secretWord)){
                System.out.println("Wrong!");
                System.out.println("You have "+guessShown+" more tries");
            } else {
                System.out.println("Great!");
            }

            System.out.println("___________________________");

            guessCount++;

        }
        if (guess.equals(secretWord)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose...");
        }
    }
}