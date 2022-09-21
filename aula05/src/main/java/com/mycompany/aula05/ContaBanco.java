
package com.mycompany.aula05;


public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
//metodos personalizados
    public void estadoAtual (){
        System.out.println("--------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC"){
            this.setSaldo (50);
        }if(t == "CP"){
            this.setSaldo (150);
        }
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinhero");
        }if (this.getSaldo() < 0){
            System.out.println("Conta em debito");
        }else{
            this.setStatus (false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(float v){
        if(this.getStatus() == true){
            this.setSaldo(getSaldo() + v);
            System.out.println("Deposito realizado com sucesso");
        }else {
            System.out.println("Impossivel depositar");
        }
    }
    public void pagarMensal(){
        int v = 0;
        
        if(this.getTipo() == "CC"){
            v = 12;
        }if(this.getTipo() == "CP"){
            v = 20;
        }if(this.getStatus() == true){
            if(this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }
    }
    public void sacar(float v){
        if(this.getStatus() == true){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque sendo efetuado");
            }else{
                System.out.println("impossivel sacar saldo insuficiente");
            }
        }else {
            System.out.println("impossivel sacar conta fechada");
        }
    }

 // metodos especiais
    public void ContaBanco(){
        this.setSaldo (0);
        this.setStatus (false);
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    
    public void setDono (String dono){
        this.dono = dono;
    }
    public String getDono(){
        return this.dono;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public float getSaldo (){
        return this.saldo;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean getStatus (){
        return this.status;
    }
    
 
    
}
