package es1;

public class Controlli {


    public static boolean stringaPariDispari(String input) {
        return input.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        return (anno % 4 == 0) && ((anno % 100 != 0) || (anno % 400 == 0));
    }

    public static void main(String[] args) {
        String testStringa = "ciaoo";
        int testAnno = 2032;

        System.out.println("La stringa \"" + testStringa + "\" ha lunghezza pari? " + stringaPariDispari(testStringa));
        System.out.println("L'anno " + testAnno + " è bisestile? " + annoBisestile(testAnno));
    }
}
