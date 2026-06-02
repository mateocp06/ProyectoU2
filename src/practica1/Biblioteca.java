/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Biblioteca {
    // Atributos
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<MaterialBiblioteca> listaMateriales;
    private ArrayList<Prestamo> listaPrestamos;
    
    // Constructores
    public Biblioteca() {
        listaUsuarios = new ArrayList<>();
        listaMateriales = new ArrayList<>();
        listaPrestamos = new ArrayList<>();
    }

    public Biblioteca(ArrayList<Usuario> listaUsuarios, ArrayList<MaterialBiblioteca> listaMateriales, ArrayList<Prestamo> listaPrestamos) {
        this.listaUsuarios = listaUsuarios;
        this.listaMateriales = listaMateriales;
        this.listaPrestamos = listaPrestamos;
    }
    
    // Getter and Setter
    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<MaterialBiblioteca> getListaMateriales() {
        return listaMateriales;
    }

    public void setListaMateriales(ArrayList<MaterialBiblioteca> listaMateriales) {
        this.listaMateriales = listaMateriales;
    }

    public ArrayList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(ArrayList<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }
    
    // Métodos
    public void agregarUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }
    
    public void agregarMaterial(MaterialBiblioteca material){
        listaMateriales.add(material);
    }
    
    public void agregarPrestamo(Prestamo prestamo) throws Exception {
        if(listaPrestamos.size() >= 3){
            throw new Exception("Limite de prestamos excedido");
        }
        listaPrestamos.add(prestamo);
    }
    
    public void devolverMaterial(MaterialBiblioteca material) throws Exception {
        if(!listaMateriales.contains(material)){
            throw new Exception("Material inexistente");
        }
        material.setDisponible("Si");
        System.out.println("Material devuelto con exito");
    }
    
    public void mostrarUsuarios(){
        for (Usuario usuario : listaUsuarios) {
            System.out.println("---Informacion del Usuario---");
            System.out.println("ID: " + usuario.getId());
            System.out.println("Nombre: " + usuario.getNombres());
            System.out.println("Cedula: " + usuario.getCedula());
            System.out.println("------------------------------");
        }
    }
    
    public void mostrarMateriales(){
        for (MaterialBiblioteca material : listaMateriales) {
            material.mostrarInformacion();
        }
    }
    
    public void mostrarPrestamos() {
        for (Prestamo prestamo : listaPrestamos){
            System.out.println("Usuario: "+ prestamo.getUsuario().getNombres());
            System.out.println("Material: "+ prestamo.getMaterial().getTitulo());
            System.out.println("Fecha Prestamo: "+ prestamo.getFechaPrestamo());
            System.out.println("Fecha Devolucion: "+ prestamo.getFechaDevolucion());
            System.out.println("-----------------------------");
        }
    }
}
