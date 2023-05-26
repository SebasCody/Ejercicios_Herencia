/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Sebas_work
 */
public class main_ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate unaFecha;
        
        Editorial editorialArcas = new Editorial();
        
        Libro libro1 = new Libro("", "EL RESPLANDOR", "88888888Z", 10);
        editorialArcas.addPublicacion(libro1);
        
        Libro libro2 = new Libro("", "JAVA PARA TODOS", "48484400A", 5);
        editorialArcas.addPublicacion(libro2);
        
        libro2.prestar();
        
        
        unaFecha = LocalDate.parse("01/01/2023", dtf);
        Revista revista1 = new Revista("", "HOLA", "33445566X", unaFecha);
        editorialArcas.addPublicacion(revista1);
        
        unaFecha = LocalDate.parse("01/01/2023", dtf);
        Revista revista2 = new Revista("", "TODO CONSOLAS", "33445566X", unaFecha);
        revista2.setPeriodicidad(TipoPeriodicidad.QUINCENAL);
        editorialArcas.addPublicacion(revista2);
        revista2.añadirNumero();
        revista2.añadirNumero();
        revista2.añadirNumero();
        revista2.añadirNumero();
        
        Scanner entrada = new Scanner(System.in);
        
        boolean salir = false;
        
        do {
            
            System.out.println("\nEJERCICIO 7 - PUBLICACIONES");
            System.out.println("===================================================");
            for (int i = 0; i < editorialArcas.getListaPublicaciones().size(); i++) {

                System.out.println(editorialArcas.getListaPublicaciones().get(i).toString());
            }
            System.out.println("===================================================");
            
            System.out.println("1. Añadir libro");
            System.out.println("2. Añadir revista");
            System.out.println("3. Prestar/Devolver libro");
            System.out.println("4. Sacar nuevo número de revista");
            System.out.println("5. Detalles de publicacion");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: "); 
            int opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el título del libro: ");
                    String titulo = entrada.nextLine();
                    
                    System.out.println("Introduce el dni del autor: ");
                    String dni = entrada.nextLine();
                    
                    System.out.println("Introduce edición: ");
                    int edition = Integer.parseInt(entrada.nextLine());
                    
                    Libro nuevoLibro = new Libro ("", titulo, dni, edition);
                    editorialArcas.addPublicacion(nuevoLibro);
                    
                    break;
                case 2:
                    System.out.println("Introduce el título de la revista: ");
                    titulo = entrada.nextLine();
                    
                    System.out.println("Introduce el dni del autor: ");
                    dni = entrada.nextLine();
                    
                    System.out.println("Introduce la fecha de publicacion en formato DD/MM/YYYY: ");
                    String fechaString = entrada.nextLine();
                    LocalDate fecha = LocalDate.parse(fechaString, dtf);
                    
                    Revista nuevaRevista = new Revista("", titulo, dni, fecha);
                    editorialArcas.addPublicacion(nuevaRevista);
                    
                    break;
                case 3:
                    System.out.println("¿Quieres sacar préstamo o devolver un libro?");
                    System.out.print("1 para PRESTAR o 2 para DEVOLVER:");
                    int sub_opcion = Integer.parseInt(entrada.nextLine());
                    String codigo_libro;
                    
                    switch (sub_opcion) {
                        case 1:
                            System.out.println("");
                            System.out.println("Introduce el código del libro que quieres sacar prestado:");
                            codigo_libro = entrada.nextLine();
                            Publicacion unaPublicacion = (editorialArcas.obtenerPublicacion(codigo_libro));
                            if (unaPublicacion instanceof Libro) {
                                Libro unLibro = (Libro)unaPublicacion;
                                
                                if (unLibro.isPrestado() == false && unLibro != null) {
                                    unLibro.setPrestado(true);
                                    System.out.println(unLibro.toString());
                                }
                                else{
                                    System.out.println("ERROR: EL LIBRO SE ENCUENTRA PRESTADO.");
                                }
                                
                            }
                            else{
                                System.out.println("ERROR: El código no es de un libro");
                            }
                            
                            
                            break;
                        case 2:
                            System.out.println("");
                            System.out.println("Introduce el código del libro que quieres devolver:");
                            codigo_libro = entrada.nextLine();
                            unaPublicacion = editorialArcas.obtenerPublicacion(codigo_libro);
                            
                            if (unaPublicacion instanceof Libro) {
                                Libro unLibro = (Libro)unaPublicacion;
                                
                                if (unLibro.isPrestado() && unLibro != null) {
                                    unLibro.setPrestado(false);
                                    System.out.println(unLibro.toString());
                                }
                                
                                else{
                                    System.out.println("ERROR: EL LIBRO YA SE ENCUENTRA DEVUELTO");
                                }
                            }
                            else{
                                System.out.println("ERROR: El código no es de un libro");
                            }
                            
                            break;
                        default:
                            System.out.println("INTRODUCE UNA OPCION VÁLIDA");
                    }
                    
                    break;
                case 4:
                    
                    System.out.println("Introduce el código de la revista: ");
                    String codigo_revista = entrada.nextLine();
                    Publicacion unaPublicacionRevista = editorialArcas.obtenerPublicacion(codigo_revista);
                    
                    if (unaPublicacionRevista instanceof Revista) {
                        Revista unaRevista = (Revista)unaPublicacionRevista;
                        unaRevista.añadirNumero();
                    }
                    else{
                        System.out.println("ERROR: El código introducido no es de una Revista");
                    }
                    
                    
                    
                    
                    break;
                case 5:
                    System.out.println("Introduce el código de la publicacion que quieres ver la información:");
                    String codigo_publicacion = entrada.nextLine();
                    Publicacion unaPubli = editorialArcas.obtenerPublicacion(codigo_publicacion);
                    
                    if (unaPubli instanceof Libro) {
                        Libro esLibro = (Libro)unaPubli;
                        System.out.println(esLibro.toString());
                    }
                    
                    if (unaPubli instanceof Revista) {
                        Revista esRevista = (Revista)unaPubli;
                        System.out.println(esRevista.toString());
                    }
                    
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Introduce una opción válida");
                    //throw new AssertionError();
            }
            
        } while (salir == false);
        
        
//        libro1.imprimir();
//        
//        revista1.imprimir();
//        revista2.imprimir();
    
    }
    
}
