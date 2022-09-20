package teste.comandos.aula4;

public class Caneta {
    private String modelo;
    private float ponta;
    
     public String getModelo(){
         return this.modelo;
     }
     
     public void setModelo(String m){
        this.modelo = m;
     }
     
     public float getPonta(){
         return this.ponta;
         
     }
     
     public void setPonta(float p){
         this.ponta = p;
     }
     
     public void status(){
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
     }
}
