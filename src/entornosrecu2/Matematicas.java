/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;

public class Matematicas {

    private int numero;
    private String usuario = "Paco";

    /**
     * Compara y muestra si un número es válido o no
     * @param Matematicas 
     */
    public Matematicas(int numEntrante) {
        if ((numEntrante > 999) || (numEntrante < 1)) {
            this.numero = 1;
            System.out.println("Número inválido, " + this.usuario + ". Se establece 1");
        } else {
            this.numero = numEntrante;
        }
    }
    /**
     * Método que recibe variable numero y compara a ver si es capicua con límite 1000
     * a partir de un número mayor que 1000 siempre sera false
     * @param capicua
     * @return boolean
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
     * Calcula el factorial de la variable num
     * @param factorial1
     * @return double
     */
    public double factorial() {
        double result = 1;
        for (int i = 1; i <= this.numero; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * Multiplica la variable numero por la variable num2
     * @param multiplicar
     * @return int
     */
    public int multiplicar(int num2) {
        return (this.numero * num2);
    }

    /**
     * Devuelve el valor de numero
     * @param getNumero
     * @return int 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Establece el valor de numero a la variable numero
     * Se le da click derecho sobre la variable, refactor y Rename... ahí le cambia el nombre a todas
     * @param setNumero 
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

}
