/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author PC
 */
public class CuentaBancaria {
    String nombre,apellido,tipocuenta;
    double saldo;

    public CuentaBancaria() {
    }
 
    public CuentaBancaria(String nombre, String apellido, String tipocuenta, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipocuenta = tipocuenta;
        this.saldo = saldo;
    }
    
    public void depositar(double monto){
        saldo = saldo + monto;
       
    }
    
    public void retirar(double monto){
        if(monto>saldo){
            System.out.println("Fondos Insuficientes");
        }else{
            saldo=saldo-monto;
            System.out.println("Retiro Exitoso");
        }
        
    }
    
    public void mostrarSaldo(){
        System.out.println("--DATOS DEL TITULAR DE LA CUENTA");
        System.out.println("Nombre: "+nombre+
                "\nApellido: "+apellido+
                "\nTipo de Cuenta: "+tipocuenta+
                "\nSaldo Actual: "+saldo);
    }
    
}
