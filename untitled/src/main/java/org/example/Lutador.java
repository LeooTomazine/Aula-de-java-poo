package org.example;

public class Lutador {

    //atributos
    private String name, nacionalidade;
    private float altura, peso;
    private String categoria;
    private int idade, vitorias, derrotas, empates;

    //metodos publicos
    public void apresentar() {
        System.out.println("-----------------------------");
        System.out.println("Lutador " + this.getName());
        System.out.println("Origem " + this.getNacionalidade());
        System.out.println(this.getIdade() + "anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando " + this.getPeso() + "kg");
        System.out.println("Ganhou " + this.getVitorias());
        System.out.println("Perdeu " + this.getDerrotas());
        System.out.println("Empatou " + this.getEmpates());
    }

    public void status() {
        System.out.println(this.getName());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
    }

    public void ganharluta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderluta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarluta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    //metodos especiais
    public Lutador(String no, String na, float al, float pe, int id, int vi, int de, int em) {
        this.name = no;
        this.nacionalidade = na;
        this.altura = al;
        this.setPeso(pe);
        this.idade = id;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
