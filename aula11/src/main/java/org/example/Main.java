package org.example;

public class Main {
    public static void main(String[] args) {

        /*
        Visitante v1 = new Visitante();
        v1.setName("jOSIVAL");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        */

        Aluno a1 = new Aluno();
        a1.setName("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setSexo("M");
        a1.PagarMensalidade();


    }
}