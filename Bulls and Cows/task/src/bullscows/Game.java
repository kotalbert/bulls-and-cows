package bullscows;

public class Game {
    private final String secret;

    public Game(int length) {
        this.secret = SecretGenerator.generateSecret(length);
    }

    public boolean grade(String guess) {
        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < secret.length(); i++) {
            char gChar = guess.charAt(i);
            char sChar = secret.charAt(i);
            if (gChar == sChar) {
                bulls++;
            } else if (secret.indexOf(gChar) != -1) {
                cows++;
            }
        }
        if (bulls == 0 && cows == 0) {
            System.out.println("Grade: None.");
            return false;
        }

        System.out.printf("Grade: %d bulls and %d cows. .%n", bulls, cows);
        if (bulls == secret.length()) {
            System.out.println("Congratulations! You guessed the secret code.");
            return true;
        }
        return false;

    }

    public String getSecret() {
        return secret;
    }
}
