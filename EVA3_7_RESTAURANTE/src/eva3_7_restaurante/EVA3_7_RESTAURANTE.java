/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_restaurante;

/**
 *
 * @author Usuario
 */
public class EVA3_7_RESTAURANTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] menu = {"Tacos al pastor (10)", "Torta", "Burritos", "Enchiladas", "Tamales", "Menudo", "Elote", "Montados", "Hamburguesa", "Sopa"};
        
        double[] precios = {70.00, 45.00, 25.00, 40.00, 30.00, 30.50, 40.00, 60.00, 60.00, 20.50};

        System.out.println("===== MENU DEL RESTAURANTE =====");

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - $" + String.format("%.2f", precios[i]));
        }
        System.out.println("===============================");
    }
}
