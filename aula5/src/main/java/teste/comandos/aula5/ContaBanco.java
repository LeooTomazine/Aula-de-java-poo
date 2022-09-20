package teste.comandos.aula5;

public class ContaBanco {
    //---------------------Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private Boolean status;
    
    //--------------------metos especias
    public void estadoAtual(){
        System.out.println("---------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
    }
    
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }
    
    
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return tipo;
    }
    
    
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return dono;
    }
    
    
    public void setSaldo(float v){
        this.saldo = v;
    }
    public int getSaldo(){
        return (int) saldo;
    }
    
    
    public void setStatus(Boolean s){
        this.status = s;
    }
    public Boolean getStatus(){
        return status;
    }
    
 //---------------------------metodos especificos
    
    public void abrirConta(String t){
        this.setTipo("CC");
        this.setStatus (true);
        
        if("CC" == t){
            this.saldo = 50;
        }
        if("CP" == t){
            this.saldo = 150;
        }
    }
    public void fecharConta(){
        if(this.saldo > 50){
            System.out.println("Retire o dinheiro para fechar a conta");
        }else if(this.saldo < 0){
            System.out.println("Pague os debitos para efetuar o encerramento da conta");
        }else{
            this.setStatus(false);
            System.out.println("conta fechada com sucesso");
        }
    }
    
    public void depositar(float v){
        if(this.status == true){
            this.setSaldo(getSaldo() + v);
            System.out.println("Valor depositado com sucesso na conta de " + this.getDono());
        }else{
            System.out.println("Erro a conta esta fechada");
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(getSaldo() - v);
                System.out.println("Valor sacado com sucesso");
            }else{
                System.out.println("Não tem saldo suficiente na conta");
            }
        }
    }
    public void pagarMensal(){
        int v = 0; 
        if(this.getTipo() == "CC"){
            v = 12;
        }if(this.getTipo() == "CP"){
            v = 20;
        }if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("lasco deu pra paga nao");
            }
    }
    
}
