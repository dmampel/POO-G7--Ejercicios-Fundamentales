/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

public class CircunferenciaServicio {
    
    public Circunferencia crearCircunferencia(){
        
        Circunferencia c1 = new Circunferencia();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca el radio de la circunferencia.");
        c1.setRadio(leer.nextDouble());
        
        return c1;
    
    }
    
    public void calcularArea(Circunferencia c1){
        
        double area;
        
        area = Math.PI * (c1.getRadio() * c1.getRadio());
        System.out.println("El area es " +area);
    }
    
    public void calcularPerimetro(Circunferencia c1){
        
        double perimetro;
        
        perimetro = 2 * Math.PI * c1.getRadio();
        System.out.println("El perimetro es " +perimetro);
    }
    
    
}
