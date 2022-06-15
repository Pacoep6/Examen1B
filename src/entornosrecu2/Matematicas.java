/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;


public class Matematicas {
     /**
     *Atributo de tipo int llamado numero 
     * @see factorial()
     * 
     */
    private int numero;
    /**
     *He refactorizado loa variable dando click derecho refactor rename
     *He creado la clase chequear num con el mismo contenido del constructor y al refactorizar no me ha cambiado las variables del metdodo nuevo  
     */
    public Matematicas(int numentrante) {
        if ((numentrante > 999) || (numentrante < 1)) {
            this.numero = 1;
            System.out.println("Número inválido. Se establece 1");
        } else {
            this.numero = numentrante;
        }
    }
    /**
     * Nuevo metodo identico al contructor
    */
    public void chequearNum(int numIn) {
        if ((numIn > 999) || (numIn < 1)) {
            this.numero = 1;
            System.out.println("Número inválido. Se establece 1");
        } else {
            this.numero = numIn;
        }
    }
    /**
     * Metodo para comprobar si el numero es capicua
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
     * Metodo para sacar el factorial de un numero
     */
    public double factorial() {
        double result = 1;
        for (int i = 1; i < this.numero; i++) {
            result = result * i;
        }
        return result;
    }
    /**
     * Metodo para multiplicar dos numeros
     */
    public int multiplicar(int num2){
        return (this.numero * num2);
    }
    /**
     * Metodo que devueleve un numero
     */
    public int getNumero() {
        return numero;
    }
    /**
     * Metodo que recoge un numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
