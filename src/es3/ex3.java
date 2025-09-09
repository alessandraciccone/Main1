package es3;

import java.util.Scanner;

public class ex3 {

    public static void esercizioWhile() {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.print("Inserisci una stringa (\"-q\" per uscire): ");
        input = scanner.nextLine();

        while (!input.equals("-q")) {
            String[] caratteri = input.split("");

            String risultato = String.join(", ", caratteri);

            System.out.println(risultato);

            System.out.print("Inserisci una stringa (\"-q\" per uscire): ");
            input = scanner.nextLine();
        }

        System.out.println("Uscita dal programma!");
    }

    public static void main(String[] args) {
        esercizioWhile();
    }
}