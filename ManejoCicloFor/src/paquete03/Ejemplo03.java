/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cadenaFinal = "";

        System.out.println("Ingrese el numero de jugadores");
        int numero = entrada.nextInt();
        entrada.nextLine();
        for (int i = 1; i <= numero; i++) {
            System.out.println("Ingrese el nombre y apellido del jugador");
            String jugador = entrada.nextLine();
            System.out.println("Ingrese la posicion en la que juega el jugador");
            String posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            int edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador");
            double estatura = entrada.nextDouble();
            entrada.nextLine();
            cadenaFinal = String.format("%s%d. %s %s, edad %d, estatura "
                    + "%.2f\n", cadenaFinal, i, jugador,
                    posicion, edad, estatura);

        }
        System.out.printf("Listado de Jugadores\n%s", cadenaFinal);
    }
}
