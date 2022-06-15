/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;
/**
 * 
 * @author Pablo
 * @version 1.0
 * @see Matematicas.factorial
 */

public class EntornosRecu2 {

    private int numRamas=3; //rellena desde el ejercicio 1!!
    private String ramaPrincipal= "main"; //rellena desde el ejercicio 1!!
    private String ramaEvolucionada = "main"; //rellena desde el ejercicio 1!!
    private String explicacionEJ5 = "Veo que la rama mas evolucionada es la main, que es la que tiene cambios mas recientes";
    private String explicacionEJ6 = "Se ve la diferencia entre la clase EntornosRecu2 y la llamada a main ";
    public static void main(String[] args) {
        
        //aquí sólo hacemos ejemplos para ver que funciona bien la clase Matemáticas
        
        Matematicas calc1 = new Matematicas(11);//ejemplo
        System.out.println(calc1.capicua()); //ejemplo
        System.out.println(calc1.multiplicar(3));
        System.out.println(calc1.factorial());
        
        
           
        
        
    }
    
}
