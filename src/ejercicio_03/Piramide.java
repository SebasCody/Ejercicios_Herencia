/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03;

/**
 *
 * @author sebastian.peralta
 */
public class Piramide extends Figura{
    
    private int altura;
    private int base;
    
    public Piramide(int altura, int base){
        this.altura = altura;
        this.base = base;
    }
    
    @Override
    public double calcularArea(){
        return (base * altura)/2;
    }
    
    @Override
    public double calcularPerimetro(){
        
        double hipotenusaLado = Math.sqrt((Math.pow(base/2,2))+(Math.pow(altura,2)));
        return hipotenusaLado*2 + base;
    }
    
    @Override
    public void pintar(){
        
        int baseN = base;
        int espaciosCadaLado = 0;
        
        if (baseN % 2 == 0) {
            espaciosCadaLado = base/2;
        }
        else{
            espaciosCadaLado = (base - 1)/2;
        }
        
        for (int i = 1; i <= altura; i++) {
            System.out.println(this.colorRelleno+" ".repeat(espaciosCadaLado)+"*".repeat(i+(i-1))+" ".repeat(espaciosCadaLado));
            espaciosCadaLado--;
        }
        
    }
    
    
    
}
