/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.json.JSONObject;

/**
 *
 * @author Sebas_work
 */
public class main_pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro unLibro = new Libro("", "Eragon", "3423CP", 10);
        unLibro.prestar();
        unLibro.devolver();
        
        System.out.println(unLibro.toString());
        unLibro.imprimir();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate fechaPrueba = LocalDate.parse("19/10/2022", dtf);
        
        Revista unaRevista = new Revista("", "MARCA", "948R", fechaPrueba);
        unaRevista.añadirNumero();
        unaRevista.imprimir();
        
    }
}
