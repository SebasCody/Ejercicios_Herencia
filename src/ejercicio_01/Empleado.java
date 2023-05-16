/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01;

/**
 *
 * @author sebastian.peralta
 */
public class Empleado {
    
    protected String dni;
    protected String nombre;
    protected double salarioBase;
    protected double precioHoraExtra;
    protected int horasExtraRealizadas;
    
    //CONSTRUCTOR
    public Empleado (String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
        this.precioHoraExtra = 10;
        this.salarioBase = 1000;
        this.horasExtraRealizadas = 0;
    }
    
    
    public double calcularSueldo(){
        double ganadoHorasExtra = (this.horasExtraRealizadas * this.precioHoraExtra);
        double totalMes = this.salarioBase + ganadoHorasExtra;
        return totalMes;
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("%s (DNI:%s) [EMPLEADO]", this.nombre, this.dni);
        
        if (this instanceof Director) {
            cadena = String.format("%s (DNI:%s) [DIRECTOR]", this.nombre, this.dni);
        }
        if (this instanceof Contable) {
            cadena = String.format("%s (DNI:%s) [CONTABLE]", this.nombre, this.dni);
        }
        
//        if (this instanceof Empleado) {
//            cadena = String.format("%s (DNI:%s) [EMPLEADO]", this.nombre, this.dni);
//        }
        return cadena;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getPrecioHoraExtra() {
        return precioHoraExtra;
    }

    public void setPrecioHoraExtra(double precioHoraExtra) {
        this.precioHoraExtra = precioHoraExtra;
    }

    public int getHorasExtraRealizadas() {
        return horasExtraRealizadas;
    }

    public void setHorasExtraRealizadas(int horasExtraRealizadas) {
        this.horasExtraRealizadas = horasExtraRealizadas;
    }
    
    
    
}
