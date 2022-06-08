/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.guia.pkg7.ejerciciosfundamentales;

import Entidades.CuentaBancaria;
import Servicios.CuentabancariaServicio;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        
        CuentabancariaServicio serv1 = new CuentabancariaServicio();
        CuentaBancaria cuenta1 = serv1.crearCuenta();
        Scanner leer = new Scanner(System.in);
        
        int respuesta;
        
        System.out.println("Ingresando...");
        
        
        do {
            System.out.println("Seleccione la operacion que desee ejecutar.");
            System.out.println("1 - Ingresar dinero. ");
            System.out.println("2 - Extraer dinero.");
            System.out.println("3 - Extraccion rápida.");
            System.out.println("4 - Consultar saldo.");
            System.out.println("5 - Consultar datos.");
            System.out.println("6 - Salir.");
            respuesta = leer.nextInt();

            switch(respuesta){
                case 1:
                    serv1.ingresar(cuenta1);
                    break;
                case 2:
                    serv1.retirar(cuenta1);
                    break;
                case 3:
                    serv1.extraccionRapida(cuenta1);
                    break;
                case 4:
                    serv1.consultarSaldo(cuenta1);
                    break;
                case 5:
                    serv1.consultarDatos(cuenta1);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                default:
                    System.out.println("No hay operaciones para este dato.");
            }
            
        } while (respuesta != 6);
    }
    
}
