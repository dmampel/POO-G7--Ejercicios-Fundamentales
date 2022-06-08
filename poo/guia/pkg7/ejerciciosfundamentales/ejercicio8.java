
package poo.guia.pkg7.ejerciciosfundamentales;

import Entidades.Cadena;
import Servicios.CadenaServicio;

public class ejercicio8 {

    public static void main(String[] args) {
        
        CadenaServicio cs1 = new CadenaServicio();
        Cadena c1 = cs1.crearCadena();
        
        int vocales = cs1.contarVocales(c1);
        System.out.println("Cantidad de vocales: " +vocales);
        
        cs1.invertirFrase(c1);
        
        
    }
    
}
