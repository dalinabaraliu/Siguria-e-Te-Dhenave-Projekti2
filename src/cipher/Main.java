package cipher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zgjidhni algoritmin: 1. Single Letter Grilles 2. Tap Code");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Shkruani tekstin: ");
        String input = scanner.nextLine().toUpperCase();

        switch (choice) {
            case 1:
                System.out.println("Enkriptuar:");
                String grilleEncrypted = SingleLetterGrilles.encrypt(input);
                System.out.println(grilleEncrypted);
                System.out.println("Dekriptuar:");
                System.out.println(SingleLetterGrilles.decrypt(grilleEncrypted));
                break;
            case 2:
                System.out.println("Enkriptuar:");
                String encoded = TapCode.encode(input);
                System.out.println(encoded);
                System.out.println("Dekriptuar:");
                System.out.println(TapCode.decode(encoded));
                break;
        }
        scanner.close();
    }
}
