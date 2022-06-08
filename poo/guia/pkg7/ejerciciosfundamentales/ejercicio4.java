
package poo.guia.pkg7.ejerciciosfundamentales;

import Entidades.Rectangulo;
import Servicios.RectanguloServicio;

public class ejercicio4 {

    public static void main(String[] args) {
        
        RectanguloServicio rS1 = new RectanguloServicio();
        Rectangulo r1 = rS1.crearRectangulo();
        
        rS1.superficie(r1);
        rS1.perimetro(r1);
        rS1.dibujarRectangulo(r1);
        
        
    }
    
}
