/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Humano;
import java.util.Date;
import java.util.Scanner;

public class HumanoServicio {
    Scanner leer = new Scanner(System.in);
    
    public Humano crearHumano(){
        
        Humano h1 = new Humano();
        
        System.out.println("Hola, como te llamas?");
        h1.setNombre(leer.next());
        System.out.println( h1.getNombre()+ " qué dia naciste?");
        h1.setDia(leer.nextInt());
        System.out.println("De qué mes?");
        h1.setMes(leer.nextInt());
        System.out.println("De qué año?");
        h1.setAño(leer.nextInt());
        
        Date fechaNacimiento = new Date(h1.getAño() - 1900, h1.getMes() - 1, h1.getDia());
        
        System.out.println("Tu nombre es " +h1.getNombre());
        System.out.println("Naciste en " +fechaNacimiento);
        
        return h1;
    }
    
    public int calcularEdad(Humano h1){
        
        int edad;
        Date fechaNacimiento = new Date(h1.getAño() - 1900, h1.getMes() - 1, h1.getDia());
        Date fechaHoy = new Date();
        
        edad = fechaHoy.getYear() - (h1.getAño() - 1900);
        return edad;
        
    }
    
    public boolean menorQue(Humano h1, int edad, int edad2){
        
        boolean menor;
        
        if (edad < edad2){
            menor = true;
        }else {
            menor = false;
        }
        
        return menor;
    }
    
}
