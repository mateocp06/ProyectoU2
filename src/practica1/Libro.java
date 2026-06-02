/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author PC
 */
public class Libro extends MaterialBiblioteca implements IPrestamo{
    // Atributos
    private String genero;
    private String numeroPaginas;
    
    // Constructores
    public Libro() {
    }

    public Libro(String genero, String numeroPaginas) {
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
    }
    
    // Getter and Setter

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(String numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    // Métodos 
    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso * 0.50;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("---Informacion del Libro---");
        System.out.println("Codigo: "+codigo+
                "\nTitulo: "+titulo+
                "\nAutor: "+autor+
                "\nAnio Publicacion: "+anioPublicacion+
                "\nDisponible: "+disponible+
                "\nGenero: "+genero+
                "\nNumero de Paginas: "+numeroPaginas);
    }

    @Override
    public void prestar() throws Exception {
        if(disponible.equalsIgnoreCase("No")){
            throw new Exception("Libro no disponible");
        }
        disponible = "No";
        System.out.println("Libro prestado...");
}
    @Override
    public void devolver() throws Exception {
        if(disponible.equalsIgnoreCase("Si")){
            throw new Exception("El libro ya fue devuelto");
        }
        disponible = "Si";
        System.out.println("Libro devuelto...");
    }
}
