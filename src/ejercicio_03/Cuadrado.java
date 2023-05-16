/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03;

/**
 *
 * @author sebastian.peralta
 */
public class Cuadrado extends Figura{
    
    private int lado;
    
    public Cuadrado(int lado){
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(){
        return lado*lado;
    }
    
    @Override
    public double calcularPerimetro(){
        return 4*lado;
    }
    
    @Override
    public void pintar(){
        for (int i = 1; i <= lado; i++) {
            System.out.println(this.colorRelleno+"* ".repeat(lado));
        }
    }
    
}
