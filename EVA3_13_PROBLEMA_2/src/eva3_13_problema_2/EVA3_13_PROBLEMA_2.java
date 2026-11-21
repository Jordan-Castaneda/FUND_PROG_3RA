/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_problema_2;

import java.util.Random;

/**
 *
 * @author conno
 */
public class EVA3_13_PROBLEMA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random random = new Random();

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        int menor = numeros[0];
        int mayor = numeros[0];

        for (int i = 1; i < 10; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("\nNumero menor: " + menor);
        System.out.println("Numero mayor: " + mayor);
    }
}
