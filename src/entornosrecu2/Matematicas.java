/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;

/**
 * @version version definitiva
 * @author admin
 */
public class Matematicas {

    /**
     * numero para hacer los calculos con el 
     * usuario para referirse al usuario por un nombre
     */
    private int numero;
    private String usuario = "Paco";

    /**
     * para hacer el metodo seleccionas el código das click derecho refactor introduce y method y le das un nombre
     * para cambiar el nombre de ña variable seleccionas la varialbe das click derecho y das a refactor rename y le pones el nuevo nombre
     * @param numIn Numero con el que se crea el objeto
     */
    public Matematicas(int numIn) {
        chequearNum(numIn);
    }

    /**
     * comprueba que el numero es válido
     * @param numEntrante - Numero que será validado
     */
    public void chequearNum(int numEntrante) {
        if ((numEntrante > 999) || (numEntrante < 1)) {
            this.numero = 1;
            System.out.println("Número inválido, " + this.usuario + ". Se establece 1");
        } else {
            this.numero = numEntrante;
        }
    }
    
    /**
     * Calcula si el numero es capicua
     * @return Devueve true si el numero es capicua y false si no lo es
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
     * Calcula el factorial del numero
     * @return Devuelve el factorial
     */
    public double factorial() {
        double result = 1;
        for (int i = 1; i <= this.numero; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * Multiplica dos numeros
     * @param num2 Numero que se multiplicara con el que esta como atributo
     * @return devuelve el resultado de la multiplicacion 
     */
    public int multiplicar(int num2) {
        return (this.numero * num2);
    }
    
    /**
     * Getter del atributo numero
     * @return devuelve el valor del atributo numero
     */
    public int getNumero() {
        return numero;
    }
    
    /**
     * Setter del atributo numero
     * @param numero Valor que se guardará en el atributo numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

}
