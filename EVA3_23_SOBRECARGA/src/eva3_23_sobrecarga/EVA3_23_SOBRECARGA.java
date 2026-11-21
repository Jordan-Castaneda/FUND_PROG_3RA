/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_23_sobrecarga;

/**
 *
 * @author conno
 */
public class EVA3_23_SOBRECARGA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimir("Hola mundo!!");
        imprimir("Hola, Jordan");
        imprimir(1000);
    }
    //SOBRECARGA DE METODOS
                       //firma
    public static void imprimir(String mensaje){//imprimir(String)
        System.out.println(mensaje);
    }
    public static void imprimir(String mensaje, String mensaje2){//imprimir(String, String2)
        System.out.println(mensaje + " - " + mensaje2);
    }
    public static void imprimir(int mensaje){//imprimir(int)
        System.out.println(mensaje);
    }
}
