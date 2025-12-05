package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length of the secret code:");
        String input = sc.nextLine();
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.printf("Error: \"%s\" isn't a valid number.%n", input);
            return;
        }
        int n = Integer.parseInt(input);
        System.out.println("Input the number of possible symbols in the code:");
        String symbolInput = sc.nextLine();
        try {
            Integer.parseInt(symbolInput);
        } catch (NumberFormatException e) {
            System.out.printf("Error: \"%s\" isn't a valid number.%n", symbolInput);
            return;
        }
        int symbolNum = Integer.parseInt(symbolInput);
        if (n <= 0) {
            System.out.println("Error: length of the secret code must be a positive number.");
            return;
        }
        if (symbolNum > 36) {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            return;
        }
        if (n > 36) {
            System.out.printf("Error: can't generate a secret number with a length of %d because there aren't enough unique symbols.%n", n);
            return;
        }
        if (n > symbolNum) {
            System.out.printf("Error: it's not possible to generate a code with a length of %d with %d unique symbols.%n", n, symbolNum);
            return;
        }
        Game game = new Game(n, symbolNum);
        System.out.println("Okay, let's start a game!");
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