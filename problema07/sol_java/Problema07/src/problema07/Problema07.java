/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema07;

import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gaoneiz
 */
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int contador = 1;
        int num1;
        String mensaje = "";
        int suma = 0;
        int par = 2;
        System.out.println("ingrese un numero par: ");
        num1 = entrada.nextInt();
        while (contador <= num1) {
            if (num1 % 2 == 0) {
                mensaje = mensaje + " " + par + " ";
                suma = suma + par;
                contador = contador + 1;
                par = par + 2;

            } else {
                System.out.println("Error no es numero par");
                break;
            }

        }
        
       
        System.out.println("" + mensaje);
        System.out.println("La suma de estos numeros es: "+ suma);
        
         
        
        
    }

}
