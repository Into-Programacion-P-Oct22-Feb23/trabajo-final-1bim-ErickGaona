/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gaoneiz
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int cantidad_trajes;
        double descuento = 0;

        double precio_trajes = 100;
        double subtotal;
        double total = 0;

        System.out.println("Ingrese cantidad de trajes");
        cantidad_trajes = entrada.nextInt();

        if (cantidad_trajes == 1) {
            precio_trajes = cantidad_trajes * precio_trajes;
            descuento = (precio_trajes * 20) / 100;
            subtotal = precio_trajes;
            total = precio_trajes - descuento;
        } else {
            if (cantidad_trajes == 2) {
                precio_trajes = cantidad_trajes * precio_trajes;
                descuento = (precio_trajes * 25) / 100;
                subtotal = precio_trajes;
                total = precio_trajes - descuento;
            } else {
                if (cantidad_trajes == 3) {
                    precio_trajes = cantidad_trajes * precio_trajes;
                    descuento = (precio_trajes * 40) / 100;
                    subtotal = precio_trajes;
                    total = precio_trajes - descuento;
                } else {
                    if (cantidad_trajes > 3) {
                        precio_trajes = cantidad_trajes * precio_trajes;
                        descuento = (precio_trajes * 50) / 100;
                        subtotal = precio_trajes;
                        total = precio_trajes - descuento;
                    }
                }
            }

        }
        System.out.printf("El subtotal a pagar es: %.1f\n", precio_trajes);
        System.out.printf("El descuento es: %.1f\n", descuento);
        System.out.printf("El total a cancelar es %.1f:\n", total);

    }
}
