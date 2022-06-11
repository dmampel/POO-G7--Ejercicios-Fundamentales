
package Servicios;

import Entidades.Arreglo;
import java.util.Arrays;
import java.util.Scanner;


public class ArregloServicio {
    Scanner leer = new Scanner(System.in);
   
    public Arreglo crearArreglo(){
        
        Arreglo v1 = new Arreglo();
        System.out.println("Vamos a crear el vector A.");
        System.out.println("Ingrese el tamaño.");
        v1.setTamaño1(leer.nextInt());
        
        int [] vector1 = new int [v1.getTamaño1()];
        int cont;
        int elemento;
        
        System.out.println("VECTOR A.");
        for (cont = 0; cont < v1.getTamaño1(); cont ++){
            elemento = (int)(Math.random()* 50);
            vector1[cont] = elemento;
            System.out.println("Vector " +cont+ ": " +vector1[cont]);
        }
        
        System.out.println("........");
       
        Arrays.sort(vector1);
        System.out.println("VECTOR A ordenado.");
        for (cont = 0; cont < v1.getTamaño1(); cont ++){
            
            System.out.println("Vector " +cont+ ": " +vector1[cont]);
        }
        
        Arreglo v2 = new Arreglo();
        System.out.println("Vamos a crear el vector B.");
        System.out.println("Ingrese el tamaño.");
        v2.setTamaño2(leer.nextInt());
        
        int [] vector2 = new int [v2.getTamaño2()];
        System.out.println("VECTOR B.");
        for (cont = 0; cont < v2.getTamaño2() / 2; cont ++){
            vector2[cont] = vector1[cont];
            System.out.println("Vector " +cont+ ": " +vector2[cont]);
        }
        
        for (cont = 10; cont < v2.getTamaño2(); cont ++){
            Arrays.fill(vector2, 0);
            System.out.println("Vector " +cont+ ": " +vector2[cont]);
        }
        return v1;
    }
    
}
