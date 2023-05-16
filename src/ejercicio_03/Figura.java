/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03;

/**
 *
 * @author sebastian.peralta
 */

public abstract class Figura {

protected String colorRelleno;
protected static final String NEGRO = "\033[30m";
protected static final String ROJO = "\033[31m";
protected static final String VERDE = "\033[32m";
protected static final String AZUL = "\033[34m";

    public Figura(){
        this.colorRelleno = NEGRO;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public abstract void pintar();

    public void setColor(TipoColor color) {
        
        switch (color) {
            case ROJO:
                this.colorRelleno = ROJO;
                break;
                
            case VERDE:
                this.colorRelleno = VERDE;
                break;
                
            case AZUL:
                this.colorRelleno = AZUL;
                break;
                
            default:
                this.colorRelleno = NEGRO;
                break;
        }
        
    }

    



}
