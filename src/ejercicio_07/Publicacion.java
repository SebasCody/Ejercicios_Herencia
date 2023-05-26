/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_07;

import org.json.JSONObject;

/**
 *
 * @author Sebas_work
 */
public abstract class Publicacion {
    
    //PROPIEDADES
    String codigo;
    String titulo;
    String dni_autor;
    String nombre_autor;
    String pais_autor;
    
    //CONSTRUCTOR
    public Publicacion(String codigo, String titulo, String dni_autor){
        this.codigo = codigo;
        this.titulo = titulo;
        this.dni_autor = dni_autor;
        
        
        if (BD_autoresSQL.conectar()== null){ 
                System.out.println("\033[31mERROR en la conexión de la bbdd\033[30m");
        }

            else{
                JSONObject jsonAutor = BD_autoresSQL.obtenerDatosAutorJSON(dni_autor);
                if (jsonAutor != null){
                    this.nombre_autor = jsonAutor.getString("nombre");
                    this.pais_autor = jsonAutor.getString("pais");
                    System.out.println("\033[32m..datos de autor encontrados en la bbdd..\033[30m");
                    BD_autoresSQL.cerrarConexion();
                }
                else{
                    System.out.println("ERROR: autor no encontrado en la BBDD");
                }
            }

        }
        
    public abstract void imprimir();
    
    
    //GETTER AND SETTER
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDni_autor() {
        return dni_autor;
    }

    public void setDni_autor(String dni_autor) {
        this.dni_autor = dni_autor;
    }

    public String getNombre_autor() {
        return nombre_autor;
    }

    public void setNombre_autor(String nombre_autor) {
        this.nombre_autor = nombre_autor;
    }

    public String getPais_autor() {
        return pais_autor;
    }

    public void setPais_autor(String pais_autor) {
        this.pais_autor = pais_autor;
    }
    
    
}
