/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author PC
 */
public abstract class MaterialBiblioteca {
    // Atributos
    protected String codigo;
    protected String titulo;
    protected String autor;
    protected int anioPublicacion;
    protected String disponible;
    // Getter and Setter
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    // Exepcion Año de Publicación 
    public void setAnioPublicacion(int anioPublicacion) throws Exception{
        if(anioPublicacion < 0){
            throw new Exception("El año de publicacion es invalido");
        }
        this.anioPublicacion = anioPublicacion;
    }

    public String getDisponible() {
        return disponible;
    }
    // Exepcion de Disponiblidad
    public void setDisponible(String disponible) throws Exception {
        if(!disponible.equalsIgnoreCase("Si") && !disponible.equalsIgnoreCase("No")){
            throw new Exception("Disponibilidad invalida");
        }
        this.disponible = disponible;
    }
    
    // Métodos Abstractos
    public abstract double calcularMulta(int diasRetraso);
    public abstract void mostrarInformacion();
}
