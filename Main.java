import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GuessingGame game = new GuessingGame();
        int highestScore = game.play(scanner);

        System.out.println("Your highest score is " + highestScore + " guesses.");

        scanner.close();
    }
}