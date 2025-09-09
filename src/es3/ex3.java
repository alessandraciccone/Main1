package es3;

import java.util.Scanner;

public class ex3 {

    public static void esercizioWhile() {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Inserisci una stringa (\"-q\" per uscire): ");
            input = scanner.nextLine();

            if (!input.equals("-q")) {
                for (int i = 0; i < input.length(); i++) {
                    System.out.print(input.charAt(i));
                    if (i < input.length() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }

        } while (!input.equals("-q"));
    }

    public static void main(String[] args) {
        esercizioWhile();
    }
}