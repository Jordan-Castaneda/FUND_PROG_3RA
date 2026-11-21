/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_22_areas;

import java.util.Scanner;

/**
 *
 * @author conno
 */
public class EVA3_22_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //1. CIRCULO
       //2.RECTANGULO
       //3. TRIANGULO
       //CALCULAR AREAS USAR METODOS PARA EL CALCULO DEL AREA DE CADA FIGURA, SOLICITAR LOS DATOS AL USUARIO (FIGURA Y VARIABLES DE LA FORMULA --> AREA, BASE, ETC.)
       int valor;
       String[] menu = {"Circulo", "Rectangulo", "Triangulo", "Salir"};
       do{
           System.out.println("**********MENU FORMULAS**********");
           imprimir(menu);
           valor = capturarEntero("Selecciona una opcion");
           switch(valor){
               case 1: //circulo
                   circulo();
                   break;
                   
               case 2: //rectangulo
                   rectangulo();
                   break;
                   
               case 3: //triangulo
                   triangulo();
                   break;
           }
       }while(valor != 4);
    }
    public static void imprimir(String[] arreglo){
           for (int i = 0; i < arreglo.length; i++) {
               System.out.println((i + 1) + ". " + arreglo[i]);
           }
           System.out.println("");
       }
    public static int capturarEntero(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int valor = captu.nextInt();
        return valor;
    }
    public static double capturarDouble(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        double valor = captu.nextInt();
        return valor;
       }
    public static void circulo(){
        System.out.println("+++++CALCULAR AREA DEL CIRCULO+++++");
        double radio = capturarDouble("Captura el radio del circulo: ");
        double area = 3.1416 * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);
    }
    public static void rectangulo(){
        System.out.println("+++++CALCULAR AREA DEL RECTANGULO+++++");
        double base = capturarDouble("Captura la base del rectangulo: ");
        double altura = capturarDouble("Captura la altura del rectangulo: ");
        double area = base * altura;
        System.out.println("El area del rectangulo es: " + area);
    }
    public static void triangulo(){
        System.out.println("+++++CALCULAR AREA DEL TRIANGULO+++++");
        double base = capturarDouble("Captura la base del triangulo: ");
        double altura = capturarDouble("Captura la altura del triangulo: ");
        double area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
    }
}
