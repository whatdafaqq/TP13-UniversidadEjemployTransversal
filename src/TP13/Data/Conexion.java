package TP13.Data;



import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Ramiro
 */

public class Conexion {
      private static final String URL="org:mariadb://localhost:3306/";
    private static final String DB="trabajopractico13_universidadulp";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection=null;
    
    private Conexion() {
    }
    
    public static Connection getConnection(){

    if (connection == null) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(URL+DB, USUARIO, PASSWORD);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los drivers!");
        }
        
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al cargar la BD!");
        }
}
        return connection;
   
}
    
}
