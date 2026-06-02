/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author PC
 */
public class Docente extends Usuario{
    // Atributos
    private String departamento;
    private String especialidad;
    
    // Constructores
    public Docente() {
    }

    public Docente(String departamento, String especialidad) {
        this.departamento = departamento;
        this.especialidad = especialidad;
    }

    public Docente(String departamento, String especialidad, int id, String cedula, String nombres, int edad, String direccionDomicilio) {
        super(id, cedula, nombres, edad, direccionDomicilio);
        this.departamento = departamento;
        this.especialidad = especialidad;
    }
    
    // Getter and Setter

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    // Métodos
    @Override
    public void solicitarPrestamo(MaterialBiblioteca material) {
        System.out.println("El docente " + getNombres()
                + " solicitó el préstamo de: "
                + material.getTitulo());
    }    
}
