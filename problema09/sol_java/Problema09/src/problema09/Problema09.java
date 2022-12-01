/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema09;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gaoneiz
 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int contador = 1;
        int num = 12;
        String serie = "S1 = ";

        System.out.print(" Ingrese el numero de terminos a imprimir:");
        int k = entrada.nextInt();

        while (contador <= k) {
            int num2 = num - contador;
            serie = serie + num + "-" + num2+"+";
            num = num  + 12;

            contador = contador + 1;
            System.out.println(serie);
        }
    }
}
