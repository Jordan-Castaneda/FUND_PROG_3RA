/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_busqueda;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_9_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int[] valores = new int[10];
        int valor;
        boolean cerrar = true;
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.println("|" + valores[i] + "|");
        }
        
        do{
            //pedir el valor
            System.out.println("INTRODUCE EL VALOR A BUSCAR EN EL ARREGLO:");
            valor = captu.nextInt();
            captu.nextLine();
            //buscar
            //RECORRER TODOS LOS VALORES DEL ARREGLO
            for (int i = 0; i < valores.length; i++) {
                if(valor == valores[i]){//EL VALOR ESTA EN EL ARREGLO
                    System.out.println("ENCONTRASTE EL VALOR: ESTA EN LA POSICION: " + i);
                    cerrar = true;
                    break;
                }else{//NO ESTA EN ESA POSICION ACTUAL
                    
                }
            }
            //si esta en el arreglo salimos del ciclo
            if(cerrar == false)
                break;
        }while(cerrar == false);
    }
}