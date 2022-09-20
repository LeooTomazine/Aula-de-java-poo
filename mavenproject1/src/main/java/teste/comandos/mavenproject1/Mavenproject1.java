/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package teste.comandos.mavenproject1;

/**
 *
 * @author leonardo
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        aula c1 = new aula();
        c1.modelo = "BIC cristal";
        c1.cor = "azul";
        //c1.ponta = "0.5f";
        c1.carga = 80;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        
        
        
        
        
    }
}
