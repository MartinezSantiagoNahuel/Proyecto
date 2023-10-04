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
        
        Cliente cliente1 = new Cliente(); 
        cliente1.correo = "cliente1@gmail.com";
        cliente1.clave = "cliente1";
        cliente1.apellido = "1";
        cliente1.nombre = "Cliente";
        
        Cliente cliente2 = new Cliente();
        cliente2.correo = "cliente2@gmail.com";
        cliente2.clave = "cliente2";
        cliente2.apellido = "2";
        cliente2.nombre = "Cliente";
        
        Cliente cliente3 = new Cliente();
        cliente3.correo = "cliente3@gmail.com";
        cliente3.clave = "cliente3";
        cliente3.apellido = "3";
        cliente3.nombre = "Cliente";
        
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente2);
        
        for (Cliente unCliente : clientes) {
            System.out.println(clientes.verNombre());
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
