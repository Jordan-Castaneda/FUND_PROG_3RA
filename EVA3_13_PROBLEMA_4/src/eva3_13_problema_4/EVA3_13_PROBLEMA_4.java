/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_problema_4;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_13_PROBLEMA_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner captu = new Scanner(System.in);

        int[][] asistencia = new int[3][5];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEstudiante " + (i + 1));

            for (int j = 0; j < 5; j++) {
                System.out.print("Dia " + (j + 1) +
                        " (1=Asistencia, 0=Falta): ");

                asistencia[i][j] = captu.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {

            int asistencias = 0;
            int faltas = 0;

            for (int j = 0; j < 5; j++) {

                if (asistencia[i][j] == 1) {
                    asistencias++;
                } else if (asistencia[i][j] == 0) {
                    faltas++;
                }
            }

            System.out.println("\nEstudiante " + (i + 1));
            System.out.println("Asistencias: " + asistencias);
            System.out.println("Inasistencias: " + faltas);
        }
    }
}
