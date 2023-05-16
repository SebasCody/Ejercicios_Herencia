/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03;

/**
 *
 * @author sebastian.peralta
 */
public class Rectangulo extends Figura{
    
    private int ladoLargo;
    private int ladoCorto;
    
    public Rectangulo(int ladoLargo, int ladoCorto){
        super();
        this.ladoCorto = ladoCorto;
        this.ladoLargo = ladoLargo;
    }
    
    @Override
    public double calcularArea(){
        double area = this.ladoCorto * this.ladoLargo;
        return area;
    }
    
    @Override
    public double calcularPerimetro(){
        double perimetro = 2*this.ladoCorto + 2*this.ladoLargo;
        return perimetro;
    }
    
    @Override
    public void pintar(){
        for (int i = 0; i < this.ladoCorto; i++) {
            System.out.println(this.colorRelleno+"* ".repeat(this.ladoLargo));
        }
    }
    
}
