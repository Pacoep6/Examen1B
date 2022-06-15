/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;
/**
 * 
 * @author admin
 * @version 
 * @see factorial() 
 */
public class EntornosRecu2 {

    private int numRamas = 3; //rellena desde el ejercicio 1!!
    private String ramaPrincipal = "main"; //rellena desde el ejercicio 1!!
    private String ramaEvolucionada = "ramaPaco"; //rellena desde el ejercicio 1!!
    private String explicacionEJ6 = "En la revision mas antigua todavia no estaban "
            + "incluidas las variables necesarias para el ejercicio 1  y el comentario de los ejemplos estabe en un sitio diferente"; //solución de
    
    public static void main(String[] args) {
        
        //aquí sólo hacemos ejemplos para ver que funciona bien la clase Matemáticas
        
        Matematicas calc1 = new Matematicas(11);//ejemplo
        System.out.println(calc1.capicua()); //ejemplo
        System.out.println(calc1.multiplicar(3));
        System.out.println(calc1.factorial());
        
        
           
        
        
    }
    
}
