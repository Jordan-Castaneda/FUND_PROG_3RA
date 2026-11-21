/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_17_problema_5;

import java.util.Scanner;

/**
 *
 * @author conno
 */
public class EVA3_17_PROBLEMA_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner captu = new Scanner(System.in);
        String[] ciudades = {"Chihuahua", "Sinaloa", "Durango", "Monterrey", "Mexico"};

        double[][] temperaturas = new double[5][7];
        for (int i = 0; i < 5; i++) {
            System.out.println("\nCiudad: " + ciudades[i]);

            for (int j = 0; j < 7; j++) {
                System.out.print("Temperatura del dia " +
                        (j + 1) + ": ");

                temperaturas[i][j] = captu.nextDouble();
            }
        }
        
        for (int i = 0; i < 5; i++) {
            double suma = 0;

            for (int j = 0; j < 7; j++) {
                suma += temperaturas[i][j];
            }

            double promedio = suma / 7;

            System.out.println("\nCiudad: " + ciudades[i]);
            System.out.println("Promedio semanal: " +
                    promedio + " grados");
        }
    }
}
