/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;
    /**
     * 
     * @author Ruslan Tejerina
     * @version 1.0
     * @see Matematicas#factorial() 
     */

public class EntornosRecu2 {

    private int numRamas; // Son 3: main, master y ramaPaco
    private String ramaPrincipal; // main
    private String ramaEvolucionada; //es la ramaPaco
    private String explicacionEJ5; // No he visto que el programa de mi ramaRuslan en la que estoy posicinado ha cambiado nada al traer aqui la ramaPaco mas evolucionada
    private String explicacionEJ6; // Diferencias En rojo aparece lo que habia con la version mas antigua 
    //y en verde lo que hemos añadido en una revision mas reciente, en mi caso aparecen en verde nuevas 
    //variables y un comentario nuevo. En la linea 13: habia  private String ramaEvolucionada; //es la ramaPaco
    public static void main(String[] args) {
        
        //aquí sólo hacemos ejemplos para ver que funciona bien la clase Matemáticas
        
        Matematicas calc1 = new Matematicas(11);//ejemplo
        System.out.println(calc1.capicua()); //ejemplo
        System.out.println(calc1.multiplicar(3));
        System.out.println(calc1.factorial());
        
        
           
        
        
    }
    
}
