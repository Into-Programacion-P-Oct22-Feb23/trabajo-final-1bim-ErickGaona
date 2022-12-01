/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gaoneiz
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int tipo;
        double pago_cuota;
        double numero_horas;
        double extra;

        System.out.println("Ingrese el nombre de empleado");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el tipo de empleado");
        tipo = entrada.nextInt();
        System.out.println("Ingrese el numero de cuotas trabajadas");
        numero_horas = entrada.nextDouble();
        System.out.println("Ingrese el pago de cuotas que se le paga por hora");
        pago_cuota = entrada.nextDouble();

        extra = numero_horas * pago_cuota;

        if (tipo == 1) {
            extra = extra * 1.5;
        } else {
            if (tipo == 2) {
                extra = extra * 2;
            } else {
                if (tipo == 3) {
                    extra = extra * 2.5;
                } else {
                    if (tipo == 4) {
                        extra = extra * 3;
                    }
                }
            }

        }
        System.out.println("Sueldo por pagar es: " + extra);
    }

}
