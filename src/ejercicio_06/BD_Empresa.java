/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_06;

import java.util.ArrayList;

/**
 *
 * @author sebastian.peralta
 */
public class BD_Empresa {
    
    private static ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    private static ArrayList<Alquiler> listaAlquileres = new ArrayList<>();
    
//    public BD_Empresa (){
//        
//        BD_Empresa.listaVehiculos = new ArrayList<>();
//        BD_Empresa.listaAlquileres = new ArrayList<>();
//        
//    }
    
    public static void añadirVehiculo(Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
    }
    
    public static void añadirAlquiler(Alquiler alquiler){
        listaAlquileres.add(alquiler);
    }
    
    public static void listarFlota(){
        
        System.out.println("=========================================");
        System.out.println("\033[34m      LISTADO DE TURISMOS    \033[30m");
        for (Vehiculo v : listaVehiculos) {
            if (v instanceof Turismo){
                if (v.isAlquilado()){
                    System.out.println("\033[35mA   "+v+"\033[30m");
                }
                else{
                    System.out.println("    "+v);
                }        
            }
        }
        System.out.println("");
        System.out.println("\033[34m      LISTADO DE FURGONETAS    \033[30m");
        for (int i = 0; i < listaVehiculos.size(); i++) {
            Vehiculo v=listaVehiculos.get(i);
            if (v instanceof Furgoneta){
                if (v.isAlquilado()){
                    System.out.println("\033[35mA   "+v+"\033[30m");
                }
                else{
                    System.out.println("    "+v);
                }   
            }
        }
        System.out.println("=========================================");
        
    }
    
    public static Vehiculo obtenerVehiculo(String matricula){
        
        Vehiculo unVehiculo = null;
        
        for (int i = 0; i < listaVehiculos.size(); i++) {
            if (listaVehiculos.get(i).matricula.equals(matricula)) {
                unVehiculo = listaVehiculos.get(i);
            }
        }
        return unVehiculo;
    }
    
    
    public static Alquiler obtenerUltimoAlquiler(String matricula){
        
        Alquiler unAlquiler = null;
        for (int i = 0; i < listaAlquileres.size(); i++) {
            if (listaAlquileres.get(i).getVehiculo().matricula.equals(matricula)) {
                unAlquiler = listaAlquileres.get(i);
            }
        }
        
        return unAlquiler;
    }
    
    
    public static void imprimirHistoricoAlquileres(){
        for (Alquiler algunAlquiler : listaAlquileres) {
            algunAlquiler.imprimirDetalles();
        }
    }

    public static ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public static void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        BD_Empresa.listaVehiculos = listaVehiculos;
    }

    public static ArrayList<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }

    public static void setListaAlquileres(ArrayList<Alquiler> listaAlquileres) {
        BD_Empresa.listaAlquileres = listaAlquileres;
    }
    
    
    
    
    
    
}
