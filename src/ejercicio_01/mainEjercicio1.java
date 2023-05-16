/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_01;

import java.util.ArrayList;

/**
 *
 * @author sebastian.peralta
 */
public class mainEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Empleado> listaEmpleados = new ArrayList();
        
        Empleado unEmpleado = new Empleado("1111A", "Alicia Camacho");
        Contable unContable = new Contable("2222A", "Marta Grey");
        Director unDirector = new Director("3333A", "Celia Blue", 2);
        
        
        unEmpleado.setHorasExtraRealizadas(5);
        unContable.setHorasExtraRealizadas(5);
        unDirector.setHorasExtraRealizadas(5);
        
        listaEmpleados.add(unEmpleado);
        listaEmpleados.add(unContable);
        listaEmpleados.add(unDirector);
        
        for (Empleado elementoEmpleado : listaEmpleados) {
            System.out.println(elementoEmpleado);
            System.out.printf("Sueldo: %.2f €/mes\n", elementoEmpleado.calcularSueldo());
            
            
            if (elementoEmpleado instanceof Contable) {
                ((Contable) elementoEmpleado).contabilizar();
            }
            
            if (elementoEmpleado instanceof Director) {
                ((Director) elementoEmpleado).analizarDatos();
            }
            System.out.println("");
        }
        
//        System.out.println(unContable);
//        System.out.printf("Sueldo: %.2f €/mes\n", unContable.calcularSueldo());
//        unContable.contabilizar();
//                
//        System.out.println(unDirector);
//        System.out.printf("Sueldo: %.2f €/mes\n", unDirector.calcularSueldo());
//        unDirector.analizarDatos();
//        
//        System.out.println(unEmpleado);
//        System.out.printf("Sueldo: %.2f €/mes\n", unEmpleado.calcularSueldo());
        
        
        
    }
    
}
