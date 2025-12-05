package bullscows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecretGenerator {

    public static String generateSecret(int length, int symbolNum) {
        String symbols = "0123456789abcdefghijklmnopqrstuvwxyz";
        List<Character> availableSymbols = new ArrayList<>();
        for (int i = 0; i < symbolNum; i++) {
            availableSymbols.add(symbols.charAt(i));
        }
        Collections.shuffle(availableSymbols);
        StringBuilder secret = new StringBuilder();
        for (int i = 0; i < length; i++) {
            secret.append(availableSymbols.get(i));
        }
        System.out.println("The); secret is prepared: " + "*".repeat(length) + " (0-9, a-" + symbols.charAt(symbolNum - 1) + ").");
        return secret.toString();

    }
}

