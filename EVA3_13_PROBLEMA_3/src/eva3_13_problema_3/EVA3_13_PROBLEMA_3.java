/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_problema_3;

/**
 *
 * @author bisonte
 */
public class EVA3_13_PROBLEMA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }
        
        System.out.println("Matriz normal:");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nMatriz inversa:");
        
        for (int i = 4; i >= 0; i--) {
            for (int j = 4; j >= 0; j--) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
