package es4;

import java.util.Scanner;

public class ex4 {

    public static void esercizioFor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        esercizioFor();
    }
}
