
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
    
    public Cafetera crearCafetera(){
        
        Cafetera caf1 = new Cafetera();
        
        System.out.println("Defina la capacidad máxima de la cafetera.");
        System.out.println("Referencia: 1000 = 1 litro.");
        caf1.setCapacidadMax(leer.nextInt());
        System.out.println("Capacidad máxima: " +caf1.getCapacidadMax()+ "ml.");
        caf1.setCantidadActual(0);
        
        
        return caf1;
    }
    
    public void llenarCafetera(Cafetera caf1){
        
        System.out.println("Llenando cafetera...");
        caf1.setCantidadActual(caf1.getCapacidadMax());
        System.out.println("Capacidad máxima: " +caf1.getCapacidadMax()+ " ml");
        System.out.println("Cantidad actual: " +caf1.getCantidadActual()+ " ml");
        
    }
    
    public void llenarTaza(Cafetera caf1){
        
        int tamañoTaza;
        int cantidadTaza;
        int diferenciaTamaño;
        
        System.out.println("Ingrese el tamaño de la taza.");
        System.out.println("Referencia: 1000 = 1 litro.");
        tamañoTaza = leer.nextInt();
        
        diferenciaTamaño = tamañoTaza - caf1.getCapacidadMax();
        
        if (caf1.getCantidadActual() >= tamañoTaza){
            System.out.println("Hay café. Sirviendo taza...");
            cantidadTaza = tamañoTaza;
            System.out.println("Taza servida, cantidad: " +cantidadTaza+ " ml");
            caf1.setCantidadActual(caf1.getCantidadActual() - cantidadTaza);
            
            if (cantidadTaza == tamañoTaza){
                System.out.println("La taza está llena.");
            }else {
                System.out.println("La taza no está llena.");
                System.out.println("Cantidad en taza: " +cantidadTaza+ " ml");
            }
        } else if (caf1.getCantidadActual() == 0){
            System.out.println("No se puede llenar la taza, ya no hay más café.");
            System.out.println("Llene la cafetera para más café.");
        }
        
        System.out.println("Café restante: " +caf1.getCantidadActual()+ " ml");
    }
    
    public void vaciarCafetera(Cafetera caf1){
        
        caf1.setCantidadActual(0);
        System.out.println("Cafetera vacía. Cantidad actual: " +caf1.getCantidadActual()+ " ml");
    }
    
    
    public void agregarCafe(Cafetera caf1){
        
        int cantidadCafe;
        
        System.out.println("Ingrese la cantidad de café.");
        cantidadCafe = leer.nextInt();
        caf1.setCantidadActual(caf1.getCantidadActual() + cantidadCafe);
        System.out.println("Café agregado.");
    }
}
