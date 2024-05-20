/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP13.Main;

import TP13.Data.AlumnoData;
import TP13.Data.MateriaData;
import java.sql.*;
import javax.swing.JOptionPane;
import TP13.Entidades.Alumno;
import TP13.Entidades.Materia;
import java.time.LocalDate;

/**
 *
 * @author Ramiro
 */
public class universidadEjemplo {

    public static void main(String[] args) {
//      Connection conn = null;
//        try {
//            //carga de driver
//            Class.forName("org.mariadb.jdbc.Driver");
//            
//            //conexion a la bd
//        conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/trabajopractico13_universidadulp", "root", "");
//        } catch (ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "Error al cargar Driver "+ex.getMessage());
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos "+ex.getMessage());
//            
//        }
//        
        //ingreso 3 alumnos
        Alumno alumno1 = new Alumno(20, 4849, "Roberto", "Gomez", LocalDate.of(2002, 07, 12), true);
        Alumno alumno2 = new Alumno(21, 4850, "Leo", "Monsio", LocalDate.of(2000, 02, 15), true);
        Alumno alumno3 = new Alumno(22, 4851, "Mati", "Soria", LocalDate.of(2001, 04, 14), true);

        AlumnoData alum = new AlumnoData();

        alum.insertarAlumno(alumno1);
        alum.insertarAlumno(alumno2);
        alum.insertarAlumno(alumno3);

        //insertar 4 materias
        MateriaData mat = new MateriaData();
        Materia materia1 = new Materia(1, "Lenguas Extranjeras", 4, true);
        Materia materia2 = new Materia(2, "Lenguas Americanas", 3, true);
        Materia materia3 = new Materia(3, "Matematica", 5, true);
        Materia materia4 = new Materia(4, "Ingles", 2, true);
        mat.insertarMateria(materia1);
        mat.insertarMateria(materia2);
        mat.insertarMateria(materia3);
        mat.insertarMateria(materia4);
        
        
    }

}
