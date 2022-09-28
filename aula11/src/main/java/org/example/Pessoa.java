package org.example;
public abstract class Pessoa {
    private String name;
    private int idade;
    private String Sexo;

    public void fazerAniversario(){
        this.idade ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    @Override
    public String toString() {
        return "Dados{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", Sexo='" + Sexo + '\'' +
                '}';
    }
}
