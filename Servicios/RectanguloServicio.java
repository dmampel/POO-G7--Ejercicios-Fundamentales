
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

public class RectanguloServicio {
    
    public Rectangulo crearRectangulo(){
        
        Rectangulo r1 = new Rectangulo();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la base del rectángulo.");
        r1.setBase(leer.nextInt());
        System.out.println("Ingrese el valor de la altura.");
        r1.setAltura(leer.nextInt());
        
        return r1;
    }
    
    public void superficie(Rectangulo r1){
        
        int superficie;
        
        superficie = r1.getBase() * r1.getAltura();
        System.out.println("Superficie: " +superficie);
    }
    
    public void perimetro(Rectangulo r1){
        
        int perimetro;
        
        perimetro = (r1.getBase() + r1.getAltura()) / 2;
        System.out.println("Perimetro: " +perimetro);
    }
    
    public void dibujarRectangulo(Rectangulo r1){
        
        int cont;
        
        for (cont = 0; cont < r1.getBase() - 1; cont++){
            System.out.print("*");
        }
        
        for (cont = 0; cont < r1.getAltura() - 1; cont++){
            System.out.println("*");
        }
        
        for (cont = 0; cont < r1.getBase(); cont++){
            System.out.print("*");
        }
        
        System.out.println();
    }
}
