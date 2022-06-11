
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
            String subCadena = "";
            subCadena += c1.getFrase().charAt(cont);
            if (subCadena.equals("a") || subCadena.equals("e") || subCadena.equals("i") || subCadena.equals("o") || subCadena.equals("u")){
                contarVocales++;
            }
        }
        
        return contarVocales;
    }
    
    public String invertirFrase(Cadena c1){
        
        String invertir = "";
        int cont;
        int longi = c1.getFrase().length();
        
        for (cont = longi - 1; cont >= 0; cont--){
            invertir += c1.getFrase().charAt(cont);
            
        }
        return invertir;
    }
    
    public int vecesRepetido(Cadena c1, String letra){
        
        int vecesRepetido = 0;
        String letraCadena;
        int  cont;
        int longi = c1.getFrase().length();
        
        for (cont = 0; cont < longi; cont++){
            letraCadena = c1.getFrase().substring(cont, cont + 1);
            if (letraCadena.equals(letra)){
                vecesRepetido++;
            }
        }
        
        return vecesRepetido;
        
    }
    
    public void compararLongitud(Cadena c1, String fraseUsuario){
        
        int longi = c1.getFrase().length();
        int longiFraseU = fraseUsuario.length();
        
        if (longi == longiFraseU){
            System.out.println("Las cadenas tienen igual longitud.");
        } else{
            System.out.println("Las cadenas tienen longitudes diferentes.");
            System.out.println("Longitud cadena 1: " +longi);
            System.out.println("Longitud cadena 2: " +longiFraseU);
        }
    }
    
    public String unirCadenas(Cadena c1, String fraseUsuario){
        
        String union;
        union = c1.getFrase().concat(fraseUsuario);
        return union;
    }
    
    public void reemplazar(Cadena c1, String caracter, String fraseUsuario){
        
        String letra;
        String letra2;
        int  cont;
        int longi = c1.getFrase().length();
        int longi2 = fraseUsuario.length();
        
        for (cont = 0; cont < longi; cont++){
            letra = c1.getFrase().substring(cont, cont + 1);
            
            if (letra.equals("a")){
                System.out.print(caracter);
            } else{
                System.out.print(letra);
            }
            
        }
        System.out.println("");
        
        for (cont = 0; cont < longi2; cont++){
            letra2 = fraseUsuario.substring(cont, cont + 1);
            
            if (letra2.equals("a")){
                System.out.print(caracter);
            } else{
                System.out.print(letra2);
            }
            
        }
        
        System.out.println("");
    }
    
    public boolean contieneLetra(Cadena c1, String letra){
        
        boolean contieneLetra = true;
        int cont;
        int longi = c1.getFrase().length();
        String caracter = "";
        
        for (cont = 0; cont < longi; cont++){
            caracter += c1.getFrase().charAt(cont);
            
            if (caracter.equals(letra)){
                contieneLetra = true;
                break;
            }else {
                contieneLetra = false;
            }
        }
        
        return contieneLetra;
        
    }
}
