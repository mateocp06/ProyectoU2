/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author PC
 */
public class Revista extends MaterialBiblioteca implements IPrestamo{
    // Atributos
    private int numeroEdicion;
    private String categoria;
    
    // Constructores
    
    public Revista() {
    }

    public Revista(int numeroEdicion, String categoria) {
        this.numeroEdicion = numeroEdicion;
        this.categoria = categoria;
    }
    
    // Getter and Setter
    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {    
        this.categoria = categoria;
    }
    
    // Métodos 
    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso * 1.00;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("---Informacion de la Revista---");
        System.out.println("Codigo: "+codigo+
                "\nTitulo: "+titulo+
                "\nAutor: "+autor+
                "\nAnio Publicacion: "+anioPublicacion+
                "\nDisponible: "+disponible+
                "\nNumero de Edicion: "+numeroEdicion+
                "\nCategoria: "+categoria);
    }
    
    @Override
    public void prestar() throws Exception {
        if(disponible.equalsIgnoreCase("No")){
            throw new Exception("Revista no disponible");
        }
        disponible = "No";
        System.out.println("Revista prestada...");
}
    @Override
    public void devolver() throws Exception {
        if(disponible.equalsIgnoreCase("Si")){
            throw new Exception("La revista ya fue devuelto");
        }
        disponible = "Si";
        System.out.println("Revista devuelta...");
    }
}
