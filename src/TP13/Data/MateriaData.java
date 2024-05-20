/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP13.Data;

import TP13.Entidades.Materia;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramiro
 */
public class MateriaData {
    Connection conn = null;
    
     public MateriaData(){
       conn = Conexion.getConnection();
   } 
    
    public void insertarMateria(Materia materia){
        
      String sql = "insert into materia (nombre, año, estado)" +
              "values(?, ?, ?)";
      try{
           PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
      ps.setString(1, materia.getNombre());
      ps.setInt(2, materia.getAnio());
      ps.setBoolean(3, materia.isEstado());
      ps.executeUpdate();
      
      ResultSet rs = ps.getGeneratedKeys();    
       if(rs.next()){
          materia.setIdMateria(rs.getInt(1));
          JOptionPane.showMessageDialog(null, "Materia Guardada!");
      }
      ps.close();
      }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia!");
          ex.printStackTrace();
      }
   }
}
