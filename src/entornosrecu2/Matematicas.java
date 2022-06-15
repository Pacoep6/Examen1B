/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;
/**
 * 
 * 
 * @author Marcos
 * @version 1.0 M
 * @see EntornosRecu2 
 * 
 */

public class Matematicas {
/**
 * Se define el atributo numero que se usará mas adelante
 */
    private int numero;

    /**
     * Constructor que nos indica si el n umero es valido o no
     * @param numIn El que se usa para crear el objeto
     */
    public Matematicas(int numIn) {
        if ((numIn > 999) || (numIn < 1)) {
            this.numero = 1;
            System.out.println("Número inválido. Se establece 1");
        } else {
            this.numero = numIn;
        }
    }
/**
 * Calcula el numero capicua
 * @return devuelve el resultado capicua segun la variable
 */
    public boolean capicua() {
        if (this.numero < 10) {
            return true;
        } else if (this.numero < 100) {
            if ((Math.floor(this.numero / 10)) == (this.numero % 10)) {
                return true;
            } else {
                return false;
            }
        } else if (this.numero < 1000) {
            if ((Math.floor(this.numero / 100)) == (this.numero % 10)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
    /**
     * Calcula el facturial
     * @return devuelve el resultado del factorial segun la variable
     */
    public double factorial() {
        double result = 1;
        for (int i = 1; i < this.numero; i++) {
            result = result * i;
        }
        return result;
    }
/**
 * Hace la multiplicacion
 * @param num2 numerto que se introduce para multiplicarlo
 * @return 
 */
    public int multiplicar(int num2){
        return (this.numero * num2);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
