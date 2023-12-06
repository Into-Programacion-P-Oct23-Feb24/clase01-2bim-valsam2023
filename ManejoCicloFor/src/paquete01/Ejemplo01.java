/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String cadenaFinal = "";

        for (int i = 1; i <= 10; i++) {
            cadenaFinal = String.format("%s%d", cadenaFinal, i);
        }

        for (int i = 1; i < 11; i++) {
            cadenaFinal = String.format("%s%d", cadenaFinal, i);
        }
        System.out.printf("%s", cadenaFinal);
        /* Aqui lo que hacemos es crear una cadena acumuladora para solo tener 
        un printf, y no en cada for, entonces en la cadena acumuladora utilizamos 
        String.format que nos ayuda a reemplazar las variables que querramos 
        acumular, para al final solo imprimir la cadena acumuladora
         */
    }

}
