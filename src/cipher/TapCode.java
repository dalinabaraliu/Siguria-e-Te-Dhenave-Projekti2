package cipher;

import java.util.HashMap;
import java.util.Map;

public class TapCode {
    private static final char[][] grid = {
        {'A', 'B', 'C', 'D', 'E'},
        {'F', 'G', 'H', 'I', 'J'},
        {'L', 'M', 'N', 'O', 'P'},
        {'Q', 'R', 'S', 'T', 'U'},
        {'V', 'W', 'X', 'Y', 'Z'}
    };

    private static final Map<Character, String> encodeMap = new HashMap<>();
    private static final Map<String, Character> decodeMap = new HashMap<>();

    static {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                char letter = grid[i][j];
                String code = ".".repeat(i + 1) + " " + ".".repeat(j + 1);
                encodeMap.put(letter, code);
                decodeMap.put(code, letter);
            }
        }
        encodeMap.put('K', encodeMap.get('C'));
    }

    public static String encode(String message) {
        message = message.toUpperCase().replaceAll("[^A-Z]", "").replace('K', 'C');
        StringBuilder encoded = new StringBuilder();
        for (char c : message.toCharArray()) {
            encoded.append(encodeMap.get(c)).append(" ");
        }
        return encoded.toString().trim();
    }

    public static String decode(String code) {
        String[] parts = code.split(" ");
        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < parts.length; i += 2) {
            String symbol = parts[i] + " " + parts[i + 1];
            decoded.append(decodeMap.getOrDefault(symbol, '?'));
        }
        return decoded.toString();
    }
}
