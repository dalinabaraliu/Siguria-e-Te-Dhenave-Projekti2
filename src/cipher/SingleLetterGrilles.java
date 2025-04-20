package cipher;

public class SingleLetterGrilles {
    private static final char PLACEHOLDER = '_';

    public static String encrypt(String text) {
        int size = (int) Math.ceil(Math.sqrt(text.length()));
        char[][] grid = new char[size][size];

        
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                grid[i][j] = PLACEHOLDER;

        
        int index = 0;
        for (int layer = 0; layer < (size + 1) / 2 && index < text.length(); layer++) {
            for (int i = layer; i < size - layer && index < text.length(); i++) grid[layer][i] = text.charAt(index++);
            for (int i = layer + 1; i < size - layer && index < text.length(); i++) grid[i][size - layer - 1] = text.charAt(index++);
            for (int i = size - layer - 2; i >= layer && index < text.length(); i--) grid[size - layer - 1][i] = text.charAt(index++);
            for (int i = size - layer - 2; i > layer && index < text.length(); i--) grid[i][layer] = text.charAt(index++);
        }

       
        StringBuilder result = new StringBuilder();
        for (char[] row : grid) {
            for (char c : row)
                result.append(c);
        }
        return result.toString();
    }

    public static String decrypt(String encrypted) {
        int size = (int) Math.sqrt(encrypted.length());
        char[][] grid = new char[size][size];
        int idx = 0;
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                grid[i][j] = encrypted.charAt(idx++);

        StringBuilder result = new StringBuilder();
        for (int layer = 0; layer < (size + 1) / 2; layer++) {
            for (int i = layer; i < size - layer; i++) result.append(grid[layer][i]);
            for (int i = layer + 1; i < size - layer; i++) result.append(grid[i][size - layer - 1]);
            for (int i = size - layer - 2; i >= layer; i--) result.append(grid[size - layer - 1][i]);
            for (int i = size - layer - 2; i > layer; i--) result.append(grid[i][layer]);
        }

        return result.toString().replaceAll(String.valueOf(PLACEHOLDER), "");
    }
}

