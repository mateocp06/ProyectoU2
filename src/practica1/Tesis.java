/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author PC
 */
public class Tesis extends MaterialBiblioteca implements IPrestamo{
    // Atributos
    private String tema;
    private String departamento;
    
    // Constructores
    public Tesis() {
    }

    public Tesis(String tema, String departamento) {
        this.tema = tema;
        this.departamento = departamento;
    }
    
    // Getter and Setter
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    // Métodos 
    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso * 1.50;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("---Informacion del Libro---");
        System.out.println("Codigo: "+codigo+
                "\nTitulo: "+titulo+
                "\nAutor: "+autor+
                "\nAnio Publicacion: "+anioPublicacion+
                "\nDisponible: "+disponible+
                "\nTema: "+tema+
                "\nDepartamento: "+departamento);
    }

    @Override
    public void prestar() throws Exception {
        if(disponible.equalsIgnoreCase("No")){
            throw new Exception("Tesis no disponible");
        }
        disponible = "No";
        System.out.println("Tesis prestada...");
}
    @Override
    public void devolver() throws Exception {
        if(disponible.equalsIgnoreCase("Si")){
            throw new Exception("La tesis ya fue devuelta");
        }
        disponible = "Si";
        System.out.println("Tesis devuelta...");
    }
}
