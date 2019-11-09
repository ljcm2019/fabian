
package Clases;

public class Universidad {

     private double promedio;
     private  int categoria;
    
    public Universidad(int categoria1, double promedio1){
    this.categoria=categoria1;
    this.promedio=promedio1;
}
   public int getCategoria(){
       return this.categoria;
   }
     public double getPromedio(){
       return this.promedio;
   }
}
