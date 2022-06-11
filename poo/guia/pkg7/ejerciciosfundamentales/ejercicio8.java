
package poo.guia.pkg7.ejerciciosfundamentales;

import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        
        CadenaServicio cs1 = new CadenaServicio();
        Cadena c1 = cs1.crearCadena();
        Scanner leer = new Scanner(System.in);
       
        int vocales = cs1.contarVocales(c1);
        System.out.println("Cantidad de vocales: " +vocales);
        
        String invertir = cs1.invertirFrase(c1);
        System.out.println("Invertida: " +invertir);
        
        System.out.println("Ingrese una letra a buscar.");
        String letra = leer.next();
        int repetido = cs1.vecesRepetido(c1, letra);
        System.out.println("La letra que ingresó aparece " +repetido+ " veces.");
        
        System.out.println("Ingrese una nueva frase.");
        String fraseUsuario = leer.next();
        cs1.compararLongitud(c1, fraseUsuario);
        String union = cs1.unirCadenas(c1, fraseUsuario);
        System.out.println("Cadena 1 + Cadena 2: " +union);
        
        System.out.println("Ingrese un caracter cualquiera.");
        String caracter = leer.next();
        cs1.reemplazar(c1, caracter, fraseUsuario);
        
        System.out.println("Ingrese una letra cualquiera.");
        letra = leer.next();
        boolean contiene = cs1.contieneLetra(c1, letra);
        System.out.println("Contiene la letra? " +contiene);
        
    }
    
    
    
}
