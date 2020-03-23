/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //$nombres = array();
        String nombres[] = new String[8];

        Scanner leerdato = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {

            System.out.print("DIGITE EL NOMBRE PARA GUARDAR EN EL ARREGLO: ");
            nombres[i] = leerdato.nextLine();
            //nombres[i] = 
            //System.out.println();
        }
        System.out.print("LOS NOMBRES INGRESADOS EN EL ARREGLO SON LOS SIGUIENTES: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(nombres[i]);
            if (i != 7) {
                System.out.print(", ");
            }

        }

    }

}
