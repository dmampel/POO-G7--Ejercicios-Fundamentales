
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {
    Scanner leer = new Scanner(System.in);
    
    public Cadena crearCadena(){
        
        Cadena c1 = new Cadena();
        
        System.out.println("Escriba algo.");
        c1.setFrase(leer.next());
        
        c1.setLongitud(c1.getFrase().length());
        System.out.println("Muchas gracias.");
        
        return c1;
    }
    
    public int contarVocales(Cadena c1){
        
        int contarVocales = 0;
        int cont;
        int longi = c1.getFrase().length();
       
        
        for (cont = 0; cont < longi; cont++){
            String subCadena = c1.getFrase().substring(cont, cont + 1);
            if (subCadena.equals("a") || subCadena.equals("e") || subCadena.equals("i") || subCadena.equals("o") || subCadena.equals("u")){
                contarVocales++;
            }
        }
        
        return contarVocales;
    }
    
    public void invertirFrase(Cadena c1){
        
        int cont;
        int longi = c1.getFrase().length();
        
        for (cont = longi - 1; cont == 0; cont--){
            String subCadena = c1.getFrase().substring(cont, cont - 1);
            System.out.print("Invertida: " +subCadena);
        }
        
    }
}
