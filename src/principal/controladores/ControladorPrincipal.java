/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;
import usuarios.modelos.Cliente;
import java.util.ArrayList;
import productos.modelos.Producto;


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
            System.out.println(unCliente.verCorreo());
            System.out.println(unCliente.verClave());
            System.out.println(unCliente.verNombre());
            System.out.println(unCliente.verApellido());
        }
        
        
        Empleado empleado1 = new Empleado("empleado1@gmail.com", "e1", "empleado", "1"); 
        Empleado empleado2 = new Empleado("empleado2@gmail.com", "e2", "empleado", "2");
        Empleado empleado3 = new Empleado("empleado3@gmail.com", "e3", "empleado", "3");

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        
        for (Empleado unEmpleado : empleados) {
            System.out.println(unEmpleado.verCorreo());
            System.out.println(unEmpleado.verClave());
            System.out.println(unEmpleado.verNombre());
            System.out.println(unEmpleado.verApellido());
        }
        
        
        Encargado encargado1 = new Encargado("empleado1@gmail.com", "e1", "empleado", "1"); 
        Encargado encargado2 = new Encargado("empleado2@gmail.com", "e2", "empleado", "2");
        Encargado encargado3 = new Encargado("empleado3@gmail.com", "e3", "empleado", "3");
        
        encargados.add(encargado1);
        encargados.add(encargado2);
        encargados.add(encargado3);
        
        for (Encargado unEncargado : encargados) {
            System.out.println(unEncargado.verCorreo());
            System.out.println(unEncargado.verClave());
            System.out.println(unEncargado.verNombre());
            System.out.println(unEncargado.verApellido());
        }
        
        
        Producto producto1 = new Producto("p1","Disponible",123,"p1",5.3f,"Almuerzo"); 
        Producto producto2 = new Producto("p2","Disponible",123,"p1",1.2f,"Postre");
        Producto producto3 = new Producto("p3","Disponible",123,"p1",1.9f,"Merienda");
       
    }      
}