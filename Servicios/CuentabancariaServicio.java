/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;


public class CuentabancariaServicio {
    Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta(){
        
        CuentaBancaria cuenta1 = new CuentaBancaria();
        
        System.out.println("Bienvenido.");
        System.out.println("Para ingresar a su cuenta, por favor, inserte el número de cuenta.");
        cuenta1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ahora, ingrese su número de DNI.");
        cuenta1.setDniCliente(leer.nextLong());
        System.out.println("Muchas gracias.");
        cuenta1.setSaldoActual(0);
        
        return cuenta1;
    }
    
    public void ingresar(CuentaBancaria cuenta1){
        
        int aIngresar;
        System.out.println("Su saldo actual: " +cuenta1.getSaldoActual());
        System.out.println("Introduzca el monto a ingresar.");
        aIngresar = leer.nextInt();
        cuenta1.setSaldoActual(cuenta1.getSaldoActual() + aIngresar);
        System.out.println("Su saldo actual: " +cuenta1.getSaldoActual());
        
    }
    
    public void retirar(CuentaBancaria cuenta1){
        
        int aRetirar;
        System.out.println("Su saldo actual: " +cuenta1.getSaldoActual());
        System.out.println("Ingrese el monto a retirar.");
        aRetirar = leer.nextInt();
        
        if (aRetirar > cuenta1.getSaldoActual()){
            cuenta1.setSaldoActual(0);
            System.out.println("El monto a retirar supera su saldo actual.");
        } else{
            cuenta1.setSaldoActual(cuenta1.getSaldoActual() - aRetirar);
            
        }
        System.out.println("Su saldo actual: " +cuenta1.getSaldoActual());
    }
    
    public void extraccionRapida(CuentaBancaria cuenta1){
        
        String confirmacion;
        int permitido;
        int aExtraer;
        System.out.println("Extracción Rápida.");
        System.out.println("Sólo puedes retirar el 20% del saldo actual.");
        System.out.println("Ingrese el monto a retirar.");
        aExtraer = leer.nextInt();
        
        
        permitido = (cuenta1.getSaldoActual() * 20) / 100;
        
        if (aExtraer < permitido){
            cuenta1.setSaldoActual(cuenta1.getSaldoActual() - permitido);
            System.out.println("Extrayendo dinero...");
            System.out.println("El saldo quedó en: " +cuenta1.getSaldoActual());
        }else {
            System.out.println("El monto a extraer supera el límite permitido del 20%.");
            System.out.println("Operacion cancelada.");
        }
    }
    
    public void consultarSaldo(CuentaBancaria cuenta1){
        
        System.out.println("Consultando saldo...");
        System.out.println("Su saldo actual: " +cuenta1.getSaldoActual());
    }
    
    public void consultarDatos (CuentaBancaria cuenta1){
        
        System.out.println("Número de cuenta: " +cuenta1.getNumeroCuenta());
        System.out.println("DNI de cliente: " +cuenta1.getDniCliente());
        
    }
    
}
