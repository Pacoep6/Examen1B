/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;

/**
 * 
 * @author admin
 * @version version ejercicio 9 Miguel
 * @see Matematicas#factorial() 
 */
public class EntornosRecu2 {

    private int numRamas = 3; //rellena desde el ejercicio 1!!
    private String ramaPrincipal="main"; //rellena desde el ejercicio 1!!
    private String ramaEvolucionada="ramaPaco"; //rellena desde el ejercicio 1!!
    private String explicacionEj5 = "nos genera un conflicto al traer a traves del comando pull la informacion de la rama paco"
            + "debido a que disponde de informacion que nosotros no tenemos y ademas nosotros disponemos de revisiones que el no dispone";
    private String explicacionEj6 = "te adjunto la explicacion en el word con la captura";
    private String explicacionEj7 = "System.out.println(calc1.factorial());";
    
    //mete aquí más variables si las pido.
    
    public static void main(String[] args) {
        
        //aquí sólo hacemos ejemplos para ver que funciona bien la clase Matemáticas
        
        Matematicas calc1 = new Matematicas(11);//ejemplo
        System.out.println(calc1.capicua()); //ejemplo
        System.out.println(calc1.multiplicar(3));
        System.out.println(calc1.factorial());
        
        
           
        
        
    }
    
}
