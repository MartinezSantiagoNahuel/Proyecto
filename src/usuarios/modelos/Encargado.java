/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;
import pedido.modelos.GestorPedidos;
import pedido.modelos.Pedido;

/**
 *
 * @author marti
 */
public class Encargado extends Usuario{
    /**
     * 
     * Atribitos heredados
     * @param correo
     * @param clave
     * @param apellido
     * @param nombre 
     */

    public Encargado(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }
    
    /**
     * Metodos get/set heredados
     * 
     */
    
    public void mostrar(){
        System.out.print("CLIENTE: ");
        super.mostrar();
    }
    
    /**
     * Método que devuelve arraylist vacio
     * @return pedidos
     */
    public ArrayList<Pedido> verPedidos() {
        GestorPedidos gp = GestorPedidos.crear();
        return gp.verPedidos();
    }
}
