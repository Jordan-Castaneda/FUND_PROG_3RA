/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_problema_1;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Usuario
 */
public class EVA3_13_PROBLEMA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        Random random = new Random();

        int[] numeros = new int[10];
        int buscar, contador = 0;
        
        System.out.print("Ingresa un numero del 1 al 9: ");
        buscar = captu.nextInt();
        
        for (int i = 0; i < 10; i++) {
            numeros[i] = random.nextInt(10);
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        contador = 0;
        
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == buscar) {
                contador++;
            }
        }

        System.out.println("\nEl numero " + buscar + " se repite " + contador + " veces.");
    }
}
