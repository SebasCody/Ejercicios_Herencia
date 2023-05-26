/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_07;

/**
 *
 * @author Sebas_work
 */
public class Libro extends Publicacion{
    
    private int num_edicion;
    private boolean prestado;
    
    //CONSTRUCTOR
    public Libro (String codigo, String titulo, String dni_autor, int edicion){
        super(codigo, titulo, dni_autor);
            
            int upperBound =99;
            int lowerBound =0;
            int number = lowerBound +(int)(Math.random()*((upperBound - lowerBound)+1));
            
        this.codigo = String.format("L-%s", number);
        this.num_edicion = edicion;
        this.prestado = false;
        
    }
    
    @Override
    public void imprimir(){
        System.out.println("DETALLES DEL LIBRO");
        System.out.println("==================");
        System.out.printf("Codigo: %s\n",this.codigo);
        System.out.printf("Titulo: %s\n", this.titulo);
        System.out.printf("Numero edición: %s\n", this.num_edicion);
        System.out.printf("Nombre autor: %s\n", this.nombre_autor);
        System.out.printf("Pais autor: %s\n", this.pais_autor);
        
        if (prestado) {
            System.out.printf("ESTADO: \033[031mPRESTADO\033[030m\n");
            
        }
        else{
            System.out.printf("ESTADO: DISPONIBLE\n");            
        }
    }
    
    
    @Override
    public String toString(){
        
        if (this.isPrestado()) {
            return String.format("LIBRO    [%s]  %s  %sª edicion  %s", this.codigo, this.titulo, this.num_edicion, "\033[031mPRESTADO\033[030m");
        }
        else{
            
            return String.format("LIBRO    [%s]  %s  %sª edicion  %s", this.codigo, this.titulo, this.num_edicion, "DISPONIBLE");
        }
    }
    
    
    public void prestar(){
        this.setPrestado(true);
        //System.out.println(this.isPrestado());
    }
    
    public void devolver(){
        this.setPrestado(false);
        //System.out.println(this.isPrestado());
    }
    
    
    
    
    //GETTER AND SETTER

    public int getNum_edicion() {
        return num_edicion;
    }

    public void setNum_edicion(int num_edicion) {
        this.num_edicion = num_edicion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
}
