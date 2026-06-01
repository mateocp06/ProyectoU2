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
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op=0;
        String nombre, apellido, tipocuenta;
        double monto, salario;
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta1 = new CuentaBancaria();
        do{
            System.out.println("---MENU DE OPCIONES---");
            System.out.println("Opcion 1: Ingresar Informacion");
            System.out.println("Opcion 2: Depositar");
            System.out.println("Opcion 3: Retirar");
            System.out.println("Opcion 4: Mostrar Saldo");
            System.out.println("Opcion 5: Salir");
            System.out.println("Ingrese la opcion: ");
            op=sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1 -> {
                    System.out.println("Nombre del Titular: ");
                    nombre=sc.nextLine();
                    System.out.println("Apellido del Titular: ");
                    apellido=sc.nextLine();
                    System.out.println("Tipo de Cuenta: ");
                    tipocuenta=sc.nextLine();
                    System.out.println("Salario: ");
                    salario=sc.nextInt();
                    sc.nextLine();
                }
                    
                case 2 -> {
                    System.out.println("Ingrese monto a depositar: ");
                    monto=sc.nextDouble();
                    cuenta1.depositar(monto);
                }
                
                case 3 -> {
                    System.out.println("Ingrese monto a retirar: ");
                    monto=sc.nextDouble();
                    cuenta1.retirar(monto);
                    System.out.println("");
                }
                    
                case 4 -> cuenta1.mostrarSaldo();   
                default -> System.out.println("Opcion Incorrecta"); 
            }
        }while(op!=5);
        sc.close();
    }
    
}
