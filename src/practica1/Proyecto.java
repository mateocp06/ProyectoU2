/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int op;
        do{
            System.out.println("\n--- SISTEMA DE BIBLIOTECA ---");
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Agregar Material");
            System.out.println("3. Registrar Prestamo");
            System.out.println("4. Devolver Material");
            System.out.println("5. Mostrar Usuarios");
            System.out.println("6. Mostrar Materiales");
            System.out.println("7. Mostrar Prestamos");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opcion: ");

            op = sc.nextInt();
            sc.nextLine();

            switch(op){

                case 1 -> {
                    try{
                        System.out.println("1. Estudiante");
                        System.out.println("2. Docente");
                        System.out.print("Seleccione una opcion: ");
                        int tipo = sc.nextInt();
                        sc.nextLine();
                        switch(tipo){
                            
                            case 1 -> {
                                Estudiante e = new Estudiante();
                                System.out.println("Ingrese la informacion del estudiante");
                                System.out.print("ID: ");
                                e.setId(sc.nextInt());
                                sc.nextLine();
                                System.out.print("Cedula: ");
                                e.setCedula(sc.nextLine());
                                System.out.print("Nombres: ");
                                e.setNombres(sc.nextLine());
                                System.out.print("Edad: ");
                                e.setEdad(sc.nextInt());
                                sc.nextLine();
                                System.out.print("Direccion: ");
                                e.setDireccionDomicilio(sc.nextLine());
                                System.out.print("Carrera: ");
                                e.setCarrera(sc.nextLine());
                                System.out.print("Semestre: ");
                                e.setSemestre(sc.nextLine());
                                biblioteca.agregarUsuario(e);
                                System.out.println("Estudiante agregado correctamente");
                            }

                            case 2 -> {
                                Docente d = new Docente();
                                System.out.println("Ingrese la informacion del docente");
                                System.out.print("ID: ");
                                d.setId(sc.nextInt());
                                sc.nextLine();
                                System.out.print("Cedula: ");
                                d.setCedula(sc.nextLine());
                                System.out.print("Nombres: ");
                                d.setNombres(sc.nextLine());
                                System.out.print("Edad: ");
                                d.setEdad(sc.nextInt());
                                sc.nextLine();
                                System.out.print("Direccion: ");
                                d.setDireccionDomicilio(sc.nextLine());
                                System.out.print("Departamento: ");
                                d.setDepartamento(sc.nextLine());
                                System.out.print("Especialidad: ");
                                d.setEspecialidad(sc.nextLine());
                                biblioteca.agregarUsuario(d);
                                System.out.println("Docente agregado correctamente");
                            }

                            default -> {
                                System.out.println("Tipo de usuario invalido");
                            }
                        }
                    }catch(Exception e){
                        System.out.println("ERROR: " + e.getMessage());
                    } 
                }
                
                case 2 -> {
                    try{
                        System.out.println("1. Libro");
                        System.out.println("2. Revista");
                        System.out.println("3. Tesis");
                        System.out.print("Seleccione una opcion: ");
                        int tipo = sc.nextInt();
                        sc.nextLine();
                        switch(tipo){

                            case 1 -> {
                                Libro libro = new Libro();
                                System.out.println("Ingrese la informacion del libro");
                                System.out.print("Codigo: ");
                                libro.setCodigo(sc.nextLine());
                                System.out.print("Titulo: ");
                                libro.setTitulo(sc.nextLine());
                                System.out.print("Autor: ");
                                libro.setAutor(sc.nextLine());
                                System.out.print("Año de publicacion: ");
                                libro.setAnioPublicacion(sc.nextInt());
                                sc.nextLine();
                                System.out.print("Disponible (Si/No): ");
                                libro.setDisponible(sc.nextLine());
                                System.out.print("Genero: ");
                                libro.setGenero(sc.nextLine());
                                System.out.print("Numero de paginas: ");
                                libro.setNumeroPaginas(sc.nextLine());
                                biblioteca.agregarMaterial(libro);
                                System.out.println("Libro agregado correctamente");
                            }

                            case 2 -> {
                                Revista revista = new Revista();
                                System.out.println("Ingrese la informacion de la revista");
                                System.out.print("Codigo: ");
                                revista.setCodigo(sc.nextLine());
                                System.out.print("Titulo: ");
                                revista.setTitulo(sc.nextLine());
                                System.out.print("Autor: ");
                                revista.setAutor(sc.nextLine());
                                System.out.print("Año de publicacion: ");
                                revista.setAnioPublicacion(sc.nextInt());
                                sc.nextLine();
                                System.out.print("Disponible (Si/No): ");
                                revista.setDisponible(sc.nextLine());
                                System.out.print("Numero de edicion: ");
                                revista.setNumeroEdicion(sc.nextInt());
                                sc.nextLine();
                                System.out.print("Categoria: ");
                                revista.setCategoria(sc.nextLine());
                                biblioteca.agregarMaterial(revista);
                                System.out.println("Revista agregada correctamente");
                            }

                            case 3 -> {

                                Tesis tesis = new Tesis();
                                System.out.println("Ingrese la informacion de la tesis");
                                System.out.print("Codigo: ");
                                tesis.setCodigo(sc.nextLine());
                                System.out.print("Titulo: ");
                                tesis.setTitulo(sc.nextLine());
                                System.out.print("Autor: ");
                                tesis.setAutor(sc.nextLine());
                                System.out.print("Año de publicacion: ");
                                tesis.setAnioPublicacion(sc.nextInt());
                                sc.nextLine();
                                System.out.print("Disponible (Si/No): ");
                                tesis.setDisponible(sc.nextLine());
                                System.out.print("Tema: ");
                                tesis.setTema(sc.nextLine());
                                System.out.print("Departamento: ");
                                tesis.setDepartamento(sc.nextLine());
                                biblioteca.agregarMaterial(tesis);
                                System.out.println("Tesis agregada correctamente");
                            }

                            default -> {
                                System.out.println("Tipo de material invalido");
                            }
                        }
                    }catch(Exception e){
                        System.out.println("ERROR: " + e.getMessage());
                    } 
                }
           
               case 3 -> {
                    try{
                        Prestamo prestamo = new Prestamo();
                        System.out.print("ID del usuario: ");
                        int idUsuario = sc.nextInt();
                        sc.nextLine();
                        Usuario usuario = null;
                        for(Usuario u : biblioteca.getListaUsuarios()){
                            if(u.getId() == idUsuario){
                                usuario = u;
                                break;
                            }
                        }
                        if(usuario == null){
                            throw new Exception("Usuario inexistente");
                        }
                        prestamo.setUsuario(usuario);
                        System.out.print("Codigo del material: ");
                        String codigo = sc.nextLine();
                        MaterialBiblioteca material = null;
                        for(MaterialBiblioteca m : biblioteca.getListaMateriales()){
                            if(m.getCodigo().equalsIgnoreCase(codigo)){
                                material = m;
                                break;
                            }
                        }
                        if(material == null){
                            throw new Exception("Material inexistente");
                        }
                        if(material.getDisponible().equalsIgnoreCase("No")){
                            throw new Exception("Material no disponible");
                        }
                        prestamo.setMaterial(material);
                        System.out.print("Fecha de prestamo: ");
                        prestamo.setFechaPrestamo(sc.nextLine());
                        System.out.print("Fecha de devolucion: ");
                        prestamo.setFechaDevolucion(sc.nextLine());
                        material.setDisponible("No");
                        biblioteca.agregarPrestamo(prestamo);
                        System.out.println("Prestamo registrado correctamente");
                    }catch(Exception e){
                        System.out.println("ERROR: " + e.getMessage());
                    }
                }
               
                case 4 -> {
                    try{
                        System.out.print("Codigo del material a devolver: ");
                        String codigo = sc.nextLine();
                        MaterialBiblioteca material = null;
                        for(MaterialBiblioteca m : biblioteca.getListaMateriales()){
                            if(m.getCodigo().equalsIgnoreCase(codigo)){
                                material = m;
                                break;
                            }
                        }
                        if(material == null){
                            throw new Exception("Material inexistente");
                        }
                        System.out.print("Dias de retraso: ");
                        int diasRetraso = sc.nextInt();
                        sc.nextLine();
                        double multa = material.calcularMulta(diasRetraso);
                        System.out.println("Multa a pagar: $" + multa);
                        biblioteca.devolverMaterial(material);
                    }catch(Exception e){
                        System.out.println("ERROR: " + e.getMessage());
                    }
                }

                case 5 -> {
                    biblioteca.mostrarUsuarios();
                }

                case 6 -> {
                    biblioteca.mostrarMateriales();
                }

                case 7 -> {
                    biblioteca.mostrarPrestamos();
                }

                case 8 -> {
                    System.out.println("Saliendo...");
                }

                default -> {
                    System.out.println("Opcion incorrecta");
                }
            }
        }while(op != 8);
        sc.close();
    }
}
