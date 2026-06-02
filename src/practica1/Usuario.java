/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author PC
 */
public class Usuario {
    // Atributos
    private int id;
    private String cedula;
    private String nombres;
    private int edad;
    private String direccionDomicilio;
    
    // Constructores
    public Usuario() {
    }

    public Usuario(int id, String cedula, String nombres, int edad, String direccionDomicilio) {
        this.id = id;
        this.cedula = cedula;
        this.nombres = nombres;
        this.edad = edad;
        this.direccionDomicilio = direccionDomicilio;
    }
    
    // Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }
    
    // Exepcion de edad
    public void setEdad(int edad) throws Exception{
        if(edad < 0){
            throw new Exception("La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    
    // Métodos
    public void consultarMateriales() {
    System.out.println("Consultando materiales...");
    }

    public void solicitarPrestamo(MaterialBiblioteca material) {
        System.out.println("Solicitando préstamo de: " + material.getTitulo());
    }   
}
