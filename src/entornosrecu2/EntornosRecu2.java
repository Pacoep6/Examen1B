/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;

public class EntornosRecu2 {

    private int numRamas=5; //rellena desde el ejercicio 1!!
    private String ramaPrincipal="main"; //rellena desde el ejercicio 1!!
    private String ramaEvolucionada="main"; //rellena desde el ejercicio 1!!
    private String explicacion5="Observo que las variables no estan inicalizadas como en esta rama";
    private String explicacion6="En la rama mas antigua sollo hay un main, en cambo en la otra rama hay variables declaradas a parte del main";
    public static void main(String[] args) {
        
        //aquí sólo hacemos ejemplos para ver que funciona bien la clase Matemáticas
        
        Matematicas calc1 = new Matematicas(11);//ejemplo
        System.out.println(calc1.capicua()); //ejemplo
        System.out.println(calc1.multiplicar(3));
        System.out.println(calc1.factorial());
        
        
           
        
        
    }
    
}
