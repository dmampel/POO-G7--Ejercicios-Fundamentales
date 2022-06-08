
package Entidades;

public class Cafetera {
    
    private int capacidadMax;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMax, int cantidadActual) {
        this.capacidadMax = capacidadMax;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    
    
    
}
