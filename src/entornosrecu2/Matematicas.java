/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;
    /**
     * 
     * @author Ruslan Tejerina
     * @version 1.0
     */

public class Matematicas {
    /**
     * Aqui se indican los atributos privados de la clase
     */

    private int numero;


    /**
     * Constructor de la clase Matematicas, inicializa y valida el numero introducido.
     * @param numEntrante
     */
    public Matematicas(int numEntrante) {
        if ((numEntrante > 999) || (numEntrante < 1)) {
            this.numero = 1;
            System.out.println("Número inválido. Se establece 1");
        } else {
            this.numero = numEntrante;
        }
    }
    /**
     * Metodo capicua 
     * Nos devuelve un booleano indicando si un num. es capicua o no
     * @return 
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
     * Metodo que devuelve el factorial de un num.
     * @return 
     */
    public double factorial() {
        double result = 1;
        for (int i = 1; i < this.numero; i++) {
            result = result * i;
        }
        return result;
    }
    /**
     * Metodo Multiplicar al que se le pasa por parametro un num.
     * y devuelve el resultado de multiplicar num2 = 3 * numero = 1
     * @param num2
     * @return 
     */
    public int multiplicar(int num2){
        return (this.numero * num2);
    }
    /**
     * Metodo getter que devuelve un numero
     * @return 
     */

    public int getNumero() {
        return numero;
    }
    /**
     * Metodo setter al que pasamos un num. por parametro
     * @param numero 
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
