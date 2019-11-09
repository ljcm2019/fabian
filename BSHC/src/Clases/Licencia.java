
package Clases;


public class Licencia {
private int tipo, cantidad;
    
    public Licencia (int tipo, int cantidad){
        this.cantidad=cantidad;
        this.tipo=tipo;
        
    }
    public int getTipo() {
        return tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

}
