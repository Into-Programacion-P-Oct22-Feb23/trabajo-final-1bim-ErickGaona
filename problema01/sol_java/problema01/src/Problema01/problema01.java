/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Problema01;

import java.util.Scanner;

/**
 *
 * @author Gaoneiz
 */
public class problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c;
        System.out.print("Ingresar valor del primer angulo: ");
        a = entrada.nextDouble();
        System.out.print("Ingresar valor del segundo angulo: ");
        b = entrada.nextDouble();
        System.out.print("Ingresar valor de tercer angulo: ");
        c = entrada.nextDouble();
        if ((a + b + c) == 180) {
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("es triangulo rectangulo");
            } else if (a > 90 || b > 90 || c > 90) {
                System.out.println("es triangulo obtusangulo");
            } else {
                System.out.println("es triangulo acutangulo");
            }
        } else {
            System.out.println("no pertenece a un triangulo");
        }
    }

}
