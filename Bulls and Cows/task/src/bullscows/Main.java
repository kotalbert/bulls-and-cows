package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 10 || n < 1) {
            System.out.println("Error: can't generate a secret number with a length of " + n + " because there aren't enough unique digits.");
        }
        Game game = new Game(n);
        System.out.printf("The random secret number is %s%n", game.getSecret());
    }
}