/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.guia.pkg7.ejerciciosfundamentales;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        
        CafeteraServicio s1 = new CafeteraServicio();
        Cafetera c1 = s1.crearCafetera();
        Scanner leer = new Scanner(System.in);
        int respuesta;
        
        
        System.out.println("Seleccione la opcion que desee ejecutar:");
        System.out.println("1 - Llenar cafetera.");
        System.out.println("2 - Llenar taza.");
        System.out.println("3 - Vaciar cafetera.");
        System.out.println("4 - Agregar café.");
        System.out.println("5 - Salir.");
        
        
        do {
            System.out.println("Seleccione la opcion que desee ejecutar:");
            respuesta = leer.nextInt();

            switch (respuesta) {
                case 1:
                    s1.llenarCafetera(c1);
                    break;
                case 2:
                    s1.llenarTaza(c1);
                    break;
                case 3:
                    s1.vaciarCafetera(c1);
                    break;
                case 4:
                    s1.agregarCafe(c1);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No hay operaciones para ese dato.");
            }

        } while (respuesta != 5);
        
    }
    
}
