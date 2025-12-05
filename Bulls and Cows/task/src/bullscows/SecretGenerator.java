package bullscows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecretGenerator {

    public static String generateSecret(int length) {
        List<Integer> list = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        // make sure the first digit is not zero
        while (list.getFirst() == 0) {
            Collections.shuffle(list);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(list.get(i));

        }
        return sb.toString();
    }
}

