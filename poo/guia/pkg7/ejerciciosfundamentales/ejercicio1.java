/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.guia.pkg7.ejerciciosfundamentales;

import Entidades.Libro;
import Servicios.LibroServicio;

public class ejercicio1 {

    public static void main(String[] args) {
        
        LibroServicio servicioUno = new LibroServicio();
        Libro libroUno = servicioUno.crearLibro();
        
        servicioUno.mostrarLibro(libroUno);
    
    }
    
}
