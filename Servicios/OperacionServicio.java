
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

public class OperacionServicio {
    
    public Operacion crearOperacion(){
        
        Operacion op1 = new Operacion();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el número 1.");
        op1.setNumero1(leer.nextInt());
        System.out.println("Ingrese el número 2.");
        op1.setNumero2(leer.nextInt());
        
        return op1;
    
    }
    
    public void sumar(Operacion op1){
        
        int resultado;
        
        resultado = op1.getNumero1() + op1.getNumero2();
        System.out.println("La suma de los números: " +resultado);
    }
    
    public void restar(Operacion op1){
        
        int resultado;
        
        resultado = op1.getNumero1() - op1.getNumero2();
        System.out.println("La resta de los números: " +resultado);
    }
    
    public void multiplicar(Operacion op1){
       
        int resultado;
        
        if (op1.getNumero1() == 0 || op1.getNumero2() == 0){
            resultado = 0;
            System.out.println("Error, multiplicar por cero da cero.");
        } else{
            resultado = op1.getNumero1() * op1.getNumero2();
        }
        
        System.out.println("La muliplicación da: " +resultado);
    }
    
    public void dividir(Operacion op1){
        
        int resultado;
        
        if (op1.getNumero1() == 0 || op1.getNumero2() == 0){
            resultado = 0;
            System.out.println("Error, no dividimos por cero.");
        } else{
            resultado = op1.getNumero1() / op1.getNumero2();
        }
        
        System.out.println("La división da: " +resultado);
    }
    
}
