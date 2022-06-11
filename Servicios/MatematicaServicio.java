/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Matematica;

public class MatematicaServicio {
    
    public Matematica crearMatematica (){
        
        Matematica m1 = new Matematica();
        
        m1.setNumero1(Math.random() * 30);
        System.out.println("Numero 1: " +m1.getNumero1());
        m1.setNumero2(Math.random() * 30);
        System.out.println("Numero 2: " +m1.getNumero2());
        System.out.println(".........");
        System.out.println("Redondeados:");
        double n1R = Math.ceil(m1.getNumero1());
        double n2R = Math.ceil(m1.getNumero2());
        System.out.println("Numero 1: " +n1R);
        System.out.println("Numero 2: " +n2R);
        
        return m1;
    }
    
    public double devolverMayor(Matematica m1){
        
        double mayor = Math.max(m1.getNumero1(), m1.getNumero2());        
        return mayor;
    }
    
    public double calcularPotencia(Matematica m1, double mayor){
        
        double resultado;
        double mayorR = Math.ceil(mayor);
        double n1Redondeado = Math.ceil(m1.getNumero1());
        double n2Redondeado = Math.ceil(m1.getNumero2());
        
        if (mayorR == n1Redondeado){
            resultado = Math.pow(n1Redondeado, n2Redondeado);
        }else {
            resultado = Math.pow(n2Redondeado, n1Redondeado);
        }
        
        return resultado;

    }
    
}
