
package hospital;


import java.io.Serializable;


public class MedicoL implements Serializable{
 
    private String Nombre;
    private String Apellido;
    private int Documento;

    public MedicoL() {
    }
    public MedicoL(String Nombre, String Apellido,int Documento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Documento = Documento;
    }
    


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre =Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }
    
    
}
