
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        Persona p1 = new Persona();
        
        System.out.println("Ingrese el nombre de la persona.");
        p1.setNombre(leer.next());
        System.out.println("Ingrese el sexo.(Hombre/Mujer/Otro).");
        p1.setSexo(leer.next());
        
        if (p1.getSexo().equals("m") || p1.getSexo().equals("h") || p1.getSexo().equals("o")){
            p1.setSexo(p1.getSexo());
        } else{
            System.out.println("Error. Dato inválido. Vuelva a intentarlo.");
            p1.setSexo(leer.next());
        }
        System.out.println("Ingrese la edad.");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el peso. (KG)");
        p1.setPeso(leer.nextInt());
        System.out.println("Ingrese la altura. (M)");
        p1.setAltura(leer.nextDouble());
        
        System.out.println("Muchas gracias.");
        
        return p1;
    }
    
    public double retorno(Persona p1){
        
        double imc;
        double retorno = 0;
        
        imc = p1.getPeso() / (p1.getAltura() * p1.getAltura());
        
        if (imc < 20){
            retorno = -1;
        } else if (imc >= 20 && imc <= 25){
            retorno = 0;
        } else if (imc > 25){
            retorno = 1;
        }
        
        return retorno;
    }
    
    public boolean esMayor(Persona p1){
        
        boolean esMayor = false;
        
        if (p1.getEdad() >= 18){
            esMayor = true;
        }
        
        return esMayor; 
    }
    
    
}
