/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema06;

/**
 *
 * @author Gaoneiz
 */
public class Problema06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 1;
        String signo = "+";
        String mensaje = "";
        int denominador = 2;

        while (contador <= 100) {

            mensaje = mensaje + signo + " " + "1/" + denominador + " ";
            contador = contador + 1;
            denominador = denominador + 1;

        }
        System.out.println("1. " + mensaje);
    }
}
