/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema10;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gaoneiz
 */
public class Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;
        int dato;
        int suma_d = 0;
        String mensaje = "";
        int contador = 0;
        int media = 0;
        String opcion;

        while (bandera) {
            System.out.println("Ingrese el dato a calcular: ");
            dato = entrada.nextInt();
            suma_d = suma_d + dato;
            entrada.nextLine();
            System.out.println("Desea salir? ingrese s para salir");
            opcion = entrada.nextLine();
            
            contador = contador + 1;
            if (opcion.equals("s")) {
                bandera = false;
                media = suma_d / contador;
                System.out.println(suma_d);
                System.out.println(media);
            }

        }
    }

}
