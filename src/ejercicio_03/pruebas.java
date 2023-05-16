/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_03;

/**
 *
 * @author sebastian.peralta
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base = 8;
        int altura = 4
                ;
        
        int baseN = base;
        int espaciosCadaLado = 0;
        
        if (baseN % 2 == 0) {
            espaciosCadaLado = base/2;
        }
        else{
            espaciosCadaLado = (base - 1)/2;
        }
        
        for (int i = 1; i <= altura; i++) {
            System.out.println(" ".repeat(espaciosCadaLado)+"*".repeat(i+(i-1))+" ".repeat(espaciosCadaLado));
            espaciosCadaLado--;
        }
    }
    
}
