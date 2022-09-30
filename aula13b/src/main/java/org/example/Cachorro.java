package org.example;

import java.util.Date;

public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("AU Au Au");
    }
    public void reagir(String frase){
        if (frase == "Toma comida" || frase == "Olá"){
            System.out.println("Abanar e Latir");
        }else {
            System.out.println("Rosnar");
        }
    }

  /*  public void printaPar(Integer par) {
        Integer a = ehPar(par);
        System.out.println(a);
    }

    public Integer ehPar(Integer num) {
        if(num%2==0){
            return num;
        }
        return null;
    }
*/
    public String reagir(int hora, int min){
        if(hora <= 12){
            return "Abanar";
        }
        if (hora > 12 && hora < 18){             //aprendendo boas praticas
            return "Latir";
        }
        return "Ignorar";
    }


                                        /*public void reagir(int hora, int min){
                                        if (hora < 12){
                                        System.out.println("Abanar");
                                        } else if (hora >= 18){

                                        }else {
                                        System.out.println("Abanar e Latir");
                                        }
                                        */
    public void reagir(Boolean Dono){
        if ( Dono == true){
            System.out.println("Abanar");
        }else {
            System.out.println("Rosnar e Latir ");
        }
    }
    public static void reagir(int idade, Float peso){
        if (idade <5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } if (peso <10) {
            System.out.println("Rosnar");
        } else {
            System.out.println("Ignorar");
        }
    }
                                        /*NOVOS TESTES DE REDUÇÃO DE CODIGO
                                    public static void main(String[] args) {
                                        System.out.println(new Date().getTime());
                                        reagir2(6, 15f);
                                        System.out.println(new Date().getTime());

                                    }
                                    public static void reagir(int idade, Float peso){
                                        if (idade < 5 && peso < 10) {
                                            System.out.println("Abanar");
                                        }
                                        if (idade < 5 && peso >= 10) {
                                            System.out.println("Latir");
                                        }
                                        if (idade > 5 && peso < 10) {
                                            System.out.println("Rosnar");
                                        }
                                        System.out.println("ignorar");
                                    }*/


}
