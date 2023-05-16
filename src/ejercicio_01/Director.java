/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01;

/**
 *
 * @author sebastian.peralta
 */
public class Director extends Empleado{
    
    private int numDespacho;
    private double plusSalario;
    
    //CONSTRUCTOR
    public Director(String dni, String nombre, int numeroDespacho){
        super(dni, nombre);
        this.numDespacho = numeroDespacho;
        this.plusSalario = 400;
    }
    
    @Override
    public double calcularSueldo(){
        return super.calcularSueldo();
    }
    
    public void analizarDatos(){
        System.out.println("Estoy analizando muchos datos...");
        System.out.printf("Mi despacho es el número %d\n", this.numDespacho);System.out.println("");
    }
    
}
