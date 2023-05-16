/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_06;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author sebastian.peralta
 */
public class Alquiler {
    
    private Vehiculo vehiculo;
    private int km_inicio;
    private int km_fin;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private double importe;
    
    //Constructor
    public Alquiler(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
        this.km_inicio = 0;
        this.km_fin = 0;
        this.fecha_inicio = null;
        this.fecha_fin = null;
        this.importe = 0.0;
    }
    
    public double calcularImporte(){
        
        if (this.vehiculo instanceof Turismo) {
            
            if (this.calcularDias() > 1) {
                //SI HA SIDO MAS DE UN DIA
                //DEBO CALCULAR EL IMPORTE DEL TURISMO
                this.importe = this.calcularDias() * ((Turismo)this.vehiculo).precioDia;
                return this.importe;
                
            }
            else if(this.calcularDias() <= 1){
                //SI HA SIDO SOLAMENTE UN DIA SE PAGA ESE DIA
                //ES DECIR, ALQUILO HOY Y DEVUELVO HOY, ENTONCES PAGO UN DIA, AUNQUE SEAN CERO DÍAS
                this.importe = ((Turismo)this.vehiculo).precioDia;
                return this.importe;
                
            }
        }
        else{
            //CALCULO EL PRECIO DEL ALQUILER DE LA FURGONETA EN BASE
            //A LOS KILÓMETROS
            
            double km_Recorridos = km_fin - km_inicio;
            this.importe = ((Furgoneta)this.vehiculo).precioKilometro * km_Recorridos;
            return this.importe;
        }
        
        return 0.0; //valor devuelto por defecto.
    }
    
    
    public void imprimirDetalles(){
        System.out.printf("\033[034m%s            %s\033[030m\n", this.vehiculo.getMatricula(), this.vehiculo.getMarca_modelo());
        System.out.printf("Km realizados: %s", km_fin - km_inicio);
        
    }
    
    private int calcularDias(){
        
        long diasEntreFechas;
        diasEntreFechas = ChronoUnit.DAYS.between(fecha_inicio, fecha_fin);
        return (int)diasEntreFechas;
        
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getKm_inicio() {
        return km_inicio;
    }

    public void setKm_inicio(int km_inicio) {
        this.km_inicio = km_inicio;
    }

    public int getKm_fin() {
        return km_fin;
    }

    public void setKm_fin(int km_fin) {
        this.km_fin = km_fin;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    
    
    
}
