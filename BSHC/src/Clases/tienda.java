
package Clases;


public class tienda {
    private final int cantidad;
    private final int codigo;
    
    
    public tienda(int codigo, int cantidad){
    this.codigo=codigo;
    this.cantidad=cantidad;
}

    
   public int getCodigo(){
       return this.codigo;
   }
     public int getCantidad(){
       return this.cantidad;
   }
   
    
}
