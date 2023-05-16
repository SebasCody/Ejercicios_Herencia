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
public class Furgoneta extends Vehiculo{
    
    double precioKilometro;
    
    public Furgoneta(String matricula, String marca_modelo, int km){
        super(matricula, marca_modelo, km);
        this.precioKilometro = 0.5;
        BD_Empresa.añadirVehiculo(this);
    }
    
    @Override
    public void alquilar(LocalDate fecha_alquiler, int km){
        
//        while(km<0){
//            System.out.println("Error. KM no puede ser menor que 0. Introduce un km ");
//            
//        }
        BD_Empresa.getListaVehiculos().remove(this);
        this.alquilado = true;
        
        Alquiler nuevoAlquiler = new Alquiler(this);
        nuevoAlquiler.setFecha_inicio(fecha_alquiler);
        nuevoAlquiler.setKm_inicio(km);
        BD_Empresa.añadirAlquiler(nuevoAlquiler);
        
    }
    
    @Override
    public void devolver(LocalDate fecha_alquiler, int km){
        BD_Empresa.getListaVehiculos().add(this);
        this.alquilado = false;
        for (int i = 0; i < BD_Empresa.getListaAlquileres().size(); i++) {
            if (BD_Empresa.getListaAlquileres().get(i).getVehiculo().equals(this)) {
                
                BD_Empresa.getListaAlquileres().get(i).setFecha_fin(fecha_alquiler);
                BD_Empresa.getListaAlquileres().get(i).setKm_fin(km);
            }

        }
    }
    
    
    
}
