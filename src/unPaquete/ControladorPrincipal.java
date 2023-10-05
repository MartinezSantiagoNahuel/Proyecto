/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unPaquete;

import java.util.ArrayList;


/**
 *
 * @author marti
 */
public class ControladorPrincipal {
    
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Encargado> encargados = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        
        Cliente cliente1 = new Cliente("cliente1@gmail.com", "c1", "Cliente", "1"); 
 
        Cliente cliente2 = new Cliente("cliente2@gmail.com", "c2", "Cliente", "2");
        
        Cliente cliente3 = new Cliente("cliente3@gmail.com", "c3", "Cliente", "3");

        
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        
        for (Cliente unCliente : clientes) {
            System.out.println(unCliente.verNombre());
        }
        
        
        Empleado empleado1 = new Empleado(); 
        Empleado empleado2 = new Empleado();
        Empleado empleado3 = new Empleado();
        
        Encargado encargado1 = new Encargado(); 
        Encargado encargado2 = new Encargado();
        Encargado encargado3 = new Encargado();
        
        Producto producto1 = new Producto(); 
        Producto producto2 = new Producto();
        Producto producto3 = new Producto();
    }      
}
