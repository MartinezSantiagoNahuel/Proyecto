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
public class Cliente extends Usuario{
    /**
     * 
     * Atributos heredados
     * @param correo
     * @param clave
     * @param apellido
     * @param nombre 
     */
    ArrayList<Pedido> pedidos = new ArrayList<>();
    
    /**
     * 
     * Constructor
     * @param correo
     * @param clave
     * @param apellido
     * @param nombre 
     */
    public Cliente(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }

    /**
     * 
     * Metodos get/set heredados
     */
    
    /**
     * Muestra los atributos del objeto creado
     */
    
    public void mostrar(){
        System.out.print("CLIENTE: ");
        super.mostrar();
    }
   
    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }


     /**
     * Método abstracto implementado
     * Devuelve una lista de pedidos
     * @return pedidos
     */
    public ArrayList<Pedido> verPedidos() {
        return this.pedidos;
    }
    
    /**
     * Agrega el pedido recibido a la lista de pedidos del cliente
     * Si ya está lo reemplaza. Si no está lo agrega
     * @param pedido pedido
     */
    public void agregarPedido(Pedido pedido){
        if(!this.pedidos.contains(pedido)){
            this.pedidos.add(pedido);
        }
        else{
            this.pedidos.remove(pedido);
            this.pedidos.add(pedido);
        }
    }
        
    /**
     * Cancela el pedido del cliente. Lo elimina de la lista
     * @param pedido pedido
     */
    public void cancelarPedido(Pedido pedido){
        this.pedidos.remove(pedido);
        if (!pedidos.contains(pedido))
            pedidos.add(pedido);
    }
}
