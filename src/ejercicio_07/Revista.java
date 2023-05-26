/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


/**
 *
 * @author Sebas_work
 */

enum TipoPeriodicidad{
    QUINCENAL,
    MENSUAL,
    TRIMESTRAL
}
    


public class Revista extends Publicacion{
    
    private TipoPeriodicidad periodicidad;
    private LocalDate fechaSalida;
    private ArrayList<LocalDate> numeros;
    
    //CONSTRUCTOR
    public Revista(String codigo, String titulo, String dni_autor, LocalDate fechaSalida){
        super(codigo, titulo, dni_autor);
        
        this.periodicidad = TipoPeriodicidad.MENSUAL;
        this.fechaSalida = fechaSalida;
        this.numeros = new ArrayList();
        
        this.numeros.add(this.fechaSalida);
        
        int upperBound = 99;
            int lowerBound = 0;
            int number = lowerBound +(int)(Math.random()*((upperBound - lowerBound)+1));
            
        this.codigo = String.format("R-%s", number);
    }
    
    @Override
    public void imprimir(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("\nDETALLES DE REVISTA");
        System.out.println("==================");
        System.out.printf("Codigo: %s\n",this.codigo);
        System.out.printf("Titulo: %s\n", this.titulo);
        System.out.printf("Nombre autor: %s\n", this.nombre_autor);
        System.out.printf("Pais autor: %s\n", this.pais_autor);
        System.out.printf("Periodicidad: %s\n", this.periodicidad);
        System.out.printf("Total números: %s\n", this.numeros.size());
        
        for (int i = 0; i < numeros.size(); i++) {
            
            System.out.printf(" Numero %s --> %s\n", i, numeros.get(i).format(dtf));
            
        }
    }
    
    @Override
    public String toString(){
        
        return String.format("REVISTA  [%s]  %s  %s ejemplares - %s", this.codigo, this.titulo, this.numeros.size(), this.periodicidad);
    }
    
    public int getTotalNumeros(){
        return this.numeros.size();
    }
    
    
    public void añadirNumero(){
        
        if (this.periodicidad == TipoPeriodicidad.MENSUAL) {
            int numerosDeLaMismaRevista = this.getTotalNumeros();
            LocalDate fechaDelNumero = this.numeros.get(numerosDeLaMismaRevista - 1).plusMonths(1);
            this.numeros.add(fechaDelNumero);
        }
        
        if (this.periodicidad == TipoPeriodicidad.TRIMESTRAL) {
            int numerosDeLaMismaRevista = this.getTotalNumeros();
            LocalDate fechaDelNumero = this.numeros.get(numerosDeLaMismaRevista - 1).plusMonths(3);
            this.numeros.add(fechaDelNumero);
        }
        
        if (this.periodicidad == TipoPeriodicidad.QUINCENAL) {
            int numerosDeLaMismaRevista = this.getTotalNumeros();
            LocalDate fechaDelNumero = this.numeros.get(numerosDeLaMismaRevista - 1).plusDays(15);
            this.numeros.add(fechaDelNumero);
        }
        
    }

    public TipoPeriodicidad getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(TipoPeriodicidad periodicidad) {
        this.periodicidad = periodicidad;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public ArrayList<LocalDate> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<LocalDate> numeros) {
        this.numeros = numeros;
    }
            
    
    
            
}
