/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP13.Entidades;

/**
 *
 * @author Ramiro
 */
public class Inscripcion {
     
    private int idInscripto;
    private Alumno alumno;
    private Materia materia;
    private int nota;

    public Inscripcion() {
    }

    
    public Inscripcion(int idInscripto, Alumno alumno, Materia materia, int nota) {
        this.idInscripto = idInscripto;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(Alumno alumno, Materia materia, int nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    
    public int getIdInscripto() {
        return idInscripto;
    }

    public void setIdInscripto(int idInscripto) {
        this.idInscripto = idInscripto;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idInscripto=" + idInscripto + ", alumno=" + alumno + ", materia=" + materia + ", nota=" + nota + '}';
    }
    
}
