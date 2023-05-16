/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01;

/**
 *
 * @author sebastian.peralta
 */
public class Contable extends Empleado{
    
    private double plusSalario;
    
    //CONSTRUCTOR
    public Contable(String dni, String nombre){
        super(dni, nombre);
        this.plusSalario = 200;
        
    }
    
    @Override
    public double calcularSueldo(){
        
        double totalMes = this.plusSalario + super.calcularSueldo();
        return totalMes;
        
    }
    
    public void contabilizar(){
        System.out.println("Estoy contabilizando...\n");
    }

    public double getPlusSalario() {
        return plusSalario;
    }

    public void setPlusSalario(double plusSalario) {
        this.plusSalario = plusSalario;
    }
    
    
    
}
