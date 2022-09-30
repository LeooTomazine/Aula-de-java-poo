package org.example;

public class Main {
    public static void main(String[] args) {

        Cachorro c = new Cachorro();
        c.reagir(true);

        System.out.println("E a reação dele foi " + c.reagir(11,45));
    }
}