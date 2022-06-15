/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;

/**
 * @version version definitiva
 * @author admin
 * @see Matematicas#factorial()  
 */
public class EntornosRecu2 {

    private int numRamas = 3; //rellena desde el ejercicio 1!!
    private String ramaPrincipal = "main"; //rellena desde el ejercicio 1!!
    private String ramaEvolucionada = "ramaPaco"; //rellena desde el ejercicio 1!!
    private String explicacionEJ6 = "Se añaden las varibles que antes no esstaban y se cambia un comentario de sitio";
    private String explicacionEJ7 = "System.out.println(calc1.factorial())";
    
    //mete aquí más variables si las pido.
    
    public static void main(String[] args) {
        
        //aquí sólo hacemos ejemplos para ver que funciona bien la clase Matemáticas
        
        Matematicas calc1 = new Matematicas(11);//ejemplo
        System.out.println(calc1.capicua()); //ejemplo
        System.out.println(calc1.multiplicar(3));
        System.out.println(calc1.factorial());
        
        
           
        
        
    }
    
}
