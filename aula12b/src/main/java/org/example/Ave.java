package org.example;

public class Ave extends Animal{
    private String corPena;


    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {

    }

    @Override
    public void emitirSom() {

    }

    public void fazerninho(){
        System.out.println("Construindo ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
