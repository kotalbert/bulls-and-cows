package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the secret code's length:");
        int n = sc.nextInt();
        if (n > 10 || n < 1) {
            System.out.println("Error: can't generate a secret number with a length of " + n + " because there aren't enough unique digits.");
            return;
        }
        System.out.println("Okay, let's start a game!");
        Game game = new Game(n);
        int turn = 1;
        boolean isGuessed = false;
        while (!isGuessed) {
            System.out.printf("Turn %d:%n", turn);
            String guess = sc.next();
            isGuessed = game.grade(guess);
            turn++;

        }
    }
}