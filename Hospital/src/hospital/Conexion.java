
package Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private Connection connection;
    private Statement statement;
    private String user="";
    private String pass="";
   
    
    public Conexion() throws SQLException{
        String url="jdbc:mysql://localhost:3306/Hospital";
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            this.connection=DriverManager.getConnection(url,user,pass);
            this.statement=this.connection.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet consulta(String sql){
        ResultSet r=null;
        try {
            r=this.getStatement().executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    public boolean query(String sql){
        boolean b=false;
        try {
            b=this.getStatement().execute(sql);
        } catch (SQLException ex) {
            b=true;
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }
    
    
    public void cerrarConexion(){
        try {
            this.getStatement().close();
            this.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private Connection getConnection(){
        return connection;
    }
    private Statement getStatement(){
        return statement;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
}

