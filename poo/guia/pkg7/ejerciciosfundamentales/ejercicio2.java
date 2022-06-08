/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.guia.pkg7.ejerciciosfundamentales;

import Entidades.Circunferencia;
import Servicios.CircunferenciaServicio;

public class ejercicio2 {

    public static void main(String[] args) {
        
        CircunferenciaServicio servicio1 = new CircunferenciaServicio();
        Circunferencia c1 = servicio1.crearCircunferencia();
        
        servicio1.calcularArea(c1);
        servicio1.calcularPerimetro(c1);
    
    }
    
}
