package org.example;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void Lutar() {
        if(this.aprovada){
            System.out.println("#### DESAFIADO ######");
            this.desafiado.apresentar();
            System.out.println("##### DESAFIANTE #####");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0: //  Empate
                    System.out.println("Empatouu!!!!!!");
                    this.desafiado.empatarluta();
                    this.desafiante.empatarluta();
                    break;
                case 1: // Desafiado vence a luta
                    System.out.println("O ganhador foi " + this.desafiado.getName());
                    this.desafiado.ganharluta();
                    this.desafiante.perderluta();
                    break;
                case 2: // Desafiante vence a luta
                    System.out.println("O vencedor foi " + this.desafiante.getName());
                    this.desafiante.ganharluta();
                    this.desafiado.perderluta();
                    break;
            }

        }else {
        System.out.println("A luta não pode acontecer");
        }
    }
    //metodos especiais


    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
