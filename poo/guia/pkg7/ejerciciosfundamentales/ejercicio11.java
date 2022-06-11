/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.guia.pkg7.ejerciciosfundamentales;

import java.util.Date;

public class ejercicio11 {

    public static void main(String[] args) {
        
        int dia = (int)(Math.random() * 31);
        int mes = (int)(Math.random() * 12);
        int año = (int)(Math.random() * 2022 - 1600);
        int diferencia;
        
        Date fecha = new Date(año, mes, dia);
        Date fechaHoy = new Date();
        
        System.out.println("Fecha actual: " +fechaHoy);
        System.out.println("Fecha random: " +fecha);
        
        
        if (fecha.after(fechaHoy)){
            diferencia = fecha.getYear() - fechaHoy.getYear();
            System.out.println("Faltan " +Math.abs(diferencia)+ " años para que lleguemos a esa fecha.");
        }else {
            diferencia = fechaHoy.getYear() - fecha.getYear();
            System.out.println("Han pasado " +Math.abs(diferencia)+ " años.");
        }
        
    }
    
}
