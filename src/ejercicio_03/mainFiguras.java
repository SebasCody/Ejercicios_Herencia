/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_03;

import java.util.ArrayList;

/**
 *
 * @author sebastian.peralta
 */
public class mainFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Rectangulo unRectangulo = new Rectangulo(8, 3);
        Cuadrado unCuadrado = new Cuadrado(3);
        Piramide unaPiramide = new Piramide(4, 7);

        unRectangulo.setColor(TipoColor.ROJO);
        unCuadrado.setColor(TipoColor.AZUL);
        unaPiramide.setColor(TipoColor.VERDE);

        ArrayList<Figura> listaFiguras = new ArrayList<>();
        listaFiguras.add(unRectangulo);
        listaFiguras.add(unCuadrado);
        listaFiguras.add(unaPiramide);

        for (Figura f : listaFiguras) {
            f.pintar();
            System.out.printf("Area:%7.2f     Perimetro %.2f\n",
                    f.calcularArea(), f.calcularPerimetro());
        }

    }

}
