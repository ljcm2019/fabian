/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Aprendiz
 */
public class Producto {
    private int cantidad;
    private double precio;
    private double descuento;
    private double total;

    public void setprecio (int c){
                this.cantidad=c;
    }

    public double obtenerprecio(){
        
        if(cantidad>0 && cantidad <=25){
            precio=cantidad*27.7;
        }else if
                (cantidad >25 && cantidad <=50 ){
            precio=cantidad * 25.5;
        }
        else if
                (cantidad >50 && cantidad <=75 ){
            precio=cantidad * 23.5;
             }
        else{
            precio=cantidad * 21.5;
            
        }
        return this.precio;
        
        }
    public double obtenerdescuento(){
      
        if(cantidad>50){
            descuento = precio * 0.50;
            
        }
        else{
            descuento = precio * 0.05;
        }
        return descuento;

    }
    public double total(){
        total=this.precio - this.descuento;
        return this.total;
    }
            }




