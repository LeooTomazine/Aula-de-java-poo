package teste.comandos.aula4;

public class Aula4 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        c1.setModelo("BIC");
        //c1.modelo = "BIC"
        
        c1.setPonta(0.5f);
        //c1.ponta = 0.5f;
        
        System.out.println("Tenho uma caneta modelo " + c1.getModelo() + " que tem a ponta de tamanho: " + c1.getPonta());
    }
}
