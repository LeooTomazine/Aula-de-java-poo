package com.mycompany.aula06;


public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //metodos especiais
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    private int getVolume(){
        return volume;
    }
    private void setVolume(int v){
        volume = v;
    } 
    
    private boolean getLigado (){
        return ligado;
    }
    private void setLigado (boolean l){
        ligado = l;
    }
    
    private boolean getTocando (){
        return tocando;
    }
    private void setTocando (boolean t){
        tocando = t;
    }
    
    //metodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirmenu() {
        System.out.println("Esta Ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.print("Volume " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10){
                System.out.print("{}");
            }
    }

    @Override
    public void fecharmenu() {
        System.out.println("Fechando Menu....");
    }

    @Override
    public void maisvolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosvolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarmudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarmudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
    
    
    
}
