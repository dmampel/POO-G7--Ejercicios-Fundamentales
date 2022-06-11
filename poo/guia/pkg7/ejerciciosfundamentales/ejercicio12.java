/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.guia.pkg7.ejerciciosfundamentales;


import Entidades.Humano;
import Servicios.HumanoServicio;
import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        
        HumanoServicio hs1 = new HumanoServicio();
        Humano h1 = hs1.crearHumano();
        Scanner leer = new Scanner(System.in);
        
        int edad = hs1.calcularEdad(h1);
        System.out.println(h1.getNombre()+ " tenés " +edad+ " años.");
        
        HumanoServicio hs2 = new HumanoServicio();
        Humano h2 = hs2.crearHumano();
        int edad2 = hs2.calcularEdad(h2);
        System.out.println(h2.getNombre()+ " tenés " +edad2+ " años.");
        
        boolean menor = hs1.menorQue(h1, edad, edad2);
        System.out.println(h1.getNombre()+ " es menor que "+h2.getNombre()+ "? " +menor);
        
    }
    
}
