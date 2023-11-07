/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;
import pedido.modelos.Pedido;

/**
 *
 * @author marti
 */
public class Empleado extends Usuario{
    /**
     * 
     * Atributos heredados
     * @param correo
     * @param clave
     * @param apellido
     * @param nombre 
     */
    
    //constructor
    public Empleado(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }
    
    /**
     * metodos get/set heredados
     * 
    */

    public void mostrar(){
        System.out.print("CLIENTE: ");
        super.mostrar();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
     /**
     * Método que devuelve arraylist vacio
     * @return pedidos
     */
    public ArrayList<Pedido> verPedidos() {
        ArrayList<Pedido> pedidos = new ArrayList<>();
         
        return pedidos;
    }
}
