/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_07;

import java.util.ArrayList;
/**
 *
 * @author Sebas_work
 */
public class Editorial {

    private ArrayList<Publicacion> listaPublicaciones;
    private Publicacion unaPublicacion;

    //CONSTRUCTOR
    public Editorial() {
        this.listaPublicaciones = new ArrayList();

    }

    public Publicacion obtenerPublicacion(String codigoPublicacion) {
        
        for (int i = 0; i < this.listaPublicaciones.size(); i++) {
            if (this.listaPublicaciones.get(i).getCodigo().equals(codigoPublicacion)) {
                return listaPublicaciones.get(i);
            }
            
        }
        return null;
    }

    public void addPublicacion(Publicacion pb) {
        this.listaPublicaciones.add(pb);
    }

    public ArrayList<Publicacion> getListaPublicaciones() {
        return listaPublicaciones;
    }

    public void setListaPublicaciones(ArrayList<Publicacion> listaPublicaciones) {
        this.listaPublicaciones = listaPublicaciones;
    }

}
