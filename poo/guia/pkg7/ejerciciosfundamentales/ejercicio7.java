
package poo.guia.pkg7.ejerciciosfundamentales;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class ejercicio7 {

    public static void main(String[] args) {
        
        int debajoDelPeso = 0;
        int pesoIdeal = 0;
        int sobrepeso = 0;
        int mayorEdad = 0;
        int menorEdad = 0;
        int porcentajePesoBajo;
        int porcentajePesoIdeal;
        int porcentajeSobrepeso;
        int porcentajeMayores;
        int porcentajeMenores;
        
        PersonaServicio s1 = new PersonaServicio();
        Persona p1 = s1.crearPersona();
        double imc1 = s1.retorno(p1);
        boolean mayor1 = s1.esMayor(p1);
        
        if (imc1 == -1) {
            debajoDelPeso++;
        } else if (imc1 == 0) {
            pesoIdeal++;
        } else if (imc1 == 1) {
            sobrepeso++;
        }

        if (p1.getEdad() >= 18) {
            mayorEdad++;
        } else {
            menorEdad++;
        }
        
        System.out.println(".....");
        
        PersonaServicio s2 = new PersonaServicio();
        Persona p2 = s2.crearPersona();
        double imc2 = s2.retorno(p2);
        boolean mayor2 = s2.esMayor(p2);
         
        if (imc2 == -1) {
            debajoDelPeso++;
        } else if (imc2 == 0) {
            pesoIdeal++;
        } else if (imc2 == 1) {
            sobrepeso++;
        }

        if (p2.getEdad() >= 18) {
            mayorEdad++;
        } else {
            menorEdad++;
        }
        
        System.out.println(".....");
        
        PersonaServicio s3 = new PersonaServicio();
        Persona p3 = s3.crearPersona();
        double imc3 = s3.retorno(p3);
        boolean mayor3 = s3.esMayor(p3);
        
        if (imc3 == -1) {
            debajoDelPeso++;
        } else if (imc3 == 0) {
            pesoIdeal++;
        } else if (imc3 == 1) {
            sobrepeso++;
        }

        if (p3.getEdad() >= 18) {
            mayorEdad++;
        } else {
            menorEdad++;
        }
        
        System.out.println(".....");
        
        PersonaServicio s4 = new PersonaServicio();
        Persona p4 = s4.crearPersona();
        double imc4 = s4.retorno(p4);
        boolean mayor4 = s4.esMayor(p4);
        
        if (imc4 == -1) {
            debajoDelPeso++;
        } else if (imc4 == 0) {
            pesoIdeal++;
        } else if (imc4 == 1) {
            sobrepeso++;
        }

        if (p4.getEdad() >= 18) {
            mayorEdad++;
        } else {
            menorEdad++;
        }
        
        porcentajePesoBajo = (debajoDelPeso * 100) / 4;
        porcentajePesoIdeal = (pesoIdeal * 100) / 4;
        porcentajeSobrepeso = (sobrepeso * 100) / 4;
        porcentajeMayores = (mayorEdad * 100) / 4;
        porcentajeMenores = (menorEdad * 100) / 4;
        
        System.out.println("Estadísticas:");
        System.out.println("Debajo del peso: el " +porcentajePesoBajo+ "%");
        System.out.println("Peso ideal: el " +porcentajePesoIdeal+ "%");
        System.out.println("Sobrepeso: el " +porcentajeSobrepeso+ "%");
        System.out.println("Mayores de edad: el " +porcentajeMayores+ "%");
        System.out.println("Menores de edad: el " +porcentajeMenores+ "%");
        
    }
    
}
