/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;
/**
 * 
 * @author Rodrigo
 */

public class EntornosRecu2 {

    private int numRamas = 3; //rellena desde el ejercicio 1!!
    private String ramaPrincipal = "main"; //rellena desde el ejercicio 1!!
    private String ramaEvolucionada = "ramaPaco"; //rellena desde el ejercicio 1!!
    private String explicacionEJ5 = "Se ha hecho un merge con la rama ramaPaco sobre la mía y muestra que se ha cambiado";
    private String explicacionEJ6 = "Se han añadido variables y movido un comentario de lugar";
    private String explicacionEJ7 = "Había un println que hacía uso de un método de otra clase que era el factorial";
    
    //mete aquí más variables si las pido.
    
    public static void main(String[] args) {
        
        //aquí sólo hacemos ejemplos para ver que funciona bien la clase Matemáticas
        
        Matematicas calc1 = new Matematicas(11);//ejemplo
        System.out.println(calc1.capicua()); //ejemplo
        System.out.println(calc1.multiplicar(3));
        System.out.println(calc1.factorial());
        
        
           
        
        
    }
    
}
