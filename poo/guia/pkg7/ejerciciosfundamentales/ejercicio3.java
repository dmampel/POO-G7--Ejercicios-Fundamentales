
package poo.guia.pkg7.ejerciciosfundamentales;

import Entidades.Operacion;
import Servicios.OperacionServicio;


public class ejercicio3 {

    
    public static void main(String[] args) {
        
        OperacionServicio opServ1 = new OperacionServicio();
        Operacion op1 = opServ1.crearOperacion();
        
        opServ1.sumar(op1);
        opServ1.restar(op1);
        opServ1.multiplicar(op1);
        opServ1.dividir(op1);
        
    }
    
}
