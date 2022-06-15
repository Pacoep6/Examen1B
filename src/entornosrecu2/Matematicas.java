/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornosrecu2;

import java.util.Scanner;

public class Matematicas {
    Scanner sc = new Scanner(System.in);

    private int numero;
    private String usuario = "Paco";

    /**
     * lo he hecho la refactorizacion a traves de la funcionalidad de netbeans de refactor-rename
     * @param numEntrante 
     */
    
    public Matematicas(int numEntrante) {
        if ((numEntrante > 999) || (numEntrante < 1)) {
            this.numero = 1;
            System.out.println("Número inválido, " + this.usuario + ". Se establece 1");
        } else {
            this.numero = numEntrante;
        }
    }

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

    public double factorial() {
        double result = 1;
        for (int i = 1; i <= this.numero; i++) {
            result = result * i;
        }
        return result;
    }

    public int multiplicar(int num2) {
        return (this.numero * num2);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * metodo para refactorizar el constructor
     * @param num 
     */
    public void chearNum(int num){
        System.out.println("dame un numero");
        numero = sc.nextInt();
        if ((numero > 999) || (numero < 1)) {
            //this.numero = 1;
            System.out.println("Número inválido, " + this.usuario + ". Se establece 1");
    }else{
            this.numero = num;
        }

}
}
