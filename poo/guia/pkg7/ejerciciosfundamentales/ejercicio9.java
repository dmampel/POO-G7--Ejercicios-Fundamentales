/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.guia.pkg7.ejerciciosfundamentales;

import Entidades.Matematica;
import Servicios.MatematicaServicio;

public class ejercicio9 {

    public static void main(String[] args) {
        
        MatematicaServicio ms1 = new MatematicaServicio();
        Matematica m1 = ms1.crearMatematica();
        
        double mayor = ms1.devolverMayor(m1);
        System.out.println("El mayor es: " +mayor);
        
        double potencia = ms1.calcularPotencia(m1, mayor);
        System.out.println("Potencia del mayor elevado al menor: " +potencia);
    }
    
    
}
