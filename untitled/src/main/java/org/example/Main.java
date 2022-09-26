package org.example;

public class Main {
    public static void main(String[] args) {
        Lutador c[] = new Lutador[6];
        c[0] = new Lutador("Pretty", "França", 1.75f, 68.9f, 31, 11, 2, 1);
        c[1] = new Lutador("Putscript", "Brasil", 1.68f, 57.8f, 29, 14, 2, 3);
        c[2] = new Lutador("snapshadow", "EUA", 1.68f, 80.9f, 35, 12, 2, 1);
        c[3] = new Lutador("Dead Code", "Australia", 1.93f, 81.6f, 28, 13, 0, 2);
        c[4] = new Lutador("UF0Cobol", "Brasil", 1.70f, 119.3f, 37, 5, 4, 3);
        c[5] = new Lutador("Nerdaart", "Eua", 1.81f, 105.9f, 30, 12, 2, 4);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(c[0], c[1]);
        UEC01.Lutar();


    }
}