/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP13.Data;

import TP13.Entidades.Alumno;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramiro
 */
public class AlumnoData {
      private Connection conn=null;
      
       public AlumnoData() {
conn = Conexion.getConnection();
    }
       
       
    public void insertarAlumno(Alumno alumno){
      
        
        String sql = "insert into alumno(dni, apellido, nombre, fechaNacimiento, estado)"
                + " values(?, ?, ?, ?, ?) ";
        
       try {
           PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           ps.setInt(1, alumno.getDni());
           ps.setString(2, alumno.getApellido());
           ps.setString(3, alumno.getNombre());
           ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
           ps.setBoolean(5, alumno.isEstado());
           ps.executeUpdate();
           
           ResultSet rs = ps.getGeneratedKeys();
           if(rs.next()){
               alumno.setIdAlumno(rs.getInt(1));
               JOptionPane.showMessageDialog(null, "Alumno Guardado!");
           }
           ps.close();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
       }
        
    }
}
