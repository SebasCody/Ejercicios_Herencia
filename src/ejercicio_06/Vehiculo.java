/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_06;

import java.time.LocalDate;

/**
 *
 * @author sebastian.peralta
 */
public abstract class Vehiculo {
    String matricula;
    String marca_modelo;
    protected int km;
    protected boolean alquilado;
    
    public Vehiculo(String matricula, String marca_modelo, int km){
        this.matricula = matricula;
        this.marca_modelo = marca_modelo;
        this.km = km;
    }
    
    public abstract void alquilar(LocalDate fecha_alquiler, int km);
    public abstract void devolver(LocalDate fecha_alquiler, int km);
    
    
    @Override
    public String toString(){
        
        return String.format("Matricula: %s -- Marca y modelo: %s -- kilometraje: %d -- Alquilado: %s", matricula, marca_modelo, km, alquilado);
    }

    
    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca_modelo() {
        return marca_modelo;
    }

    public void setMarca_modelo(String marca_modelo) {
        this.marca_modelo = marca_modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
    
    
}
