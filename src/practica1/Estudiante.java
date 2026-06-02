/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author PC
 */
public class Estudiante extends Usuario{
    // Atributos
    private String carrera;
    private String semestre;
    
    // Constructores
    public Estudiante() {
    }

    public Estudiante(String carrera, String semestre) {
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public Estudiante(String carrera, String semestre, int id, String cedula, String nombres, int edad, String direccionDomicilio) {
        super(id, cedula, nombres, edad, direccionDomicilio);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
    // Getter and Setter

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    // Métodos
    @Override
    public void solicitarPrestamo(MaterialBiblioteca material) {
        System.out.println("El estudiante " + getNombres()
                + " solicitó el préstamo de: "
                + material.getTitulo());
    }
}
