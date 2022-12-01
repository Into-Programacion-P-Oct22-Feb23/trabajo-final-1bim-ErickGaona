/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gaoneiz y Ruben
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int x;
        int y;

        System.out.println("Ingrese el valor de X");
        x = entrada.nextInt();
        System.out.println("Ingrese el valor de Y");
        y = entrada.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Esta en el primer cuadrante");
        } else {
            if (x < 0 && y > 0) {
                System.out.println("Esta en el segundo cuadrante");
            } else {
                if (x < 0 && y < 0) {
                    System.out.println("Esta en el tercer cuadrante");
                } else {
                    if (x > 0 && y < 0) {
                        System.out.println("Esta en el cuarto cuadrante");
                    }
                }
            }

        }

    }

}
