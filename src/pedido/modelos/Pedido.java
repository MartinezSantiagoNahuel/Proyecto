/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import usuarios.modelos.Cliente;

/**
 *
 * @author marti
 */
public class Pedido {
    private int numero;
    private LocalDateTime fechaYhora;
    private Cliente unCliente;
    private Estado estado;
     private ArrayList<ProductoDelPedido> pdp = new ArrayList<>();

    public Pedido(int numero, LocalDateTime fechaYhora, ArrayList<ProductoDelPedido> pdp, Cliente unCliente) {
        
        this.numero = numero;
        this.fechaYhora = fechaYhora;
        this.unCliente = unCliente;
//       this.estado = estado;
        this.pdp = pdp;
    }
     
     


    public int verNumero() {
        return numero;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }
    
     /**
     * Devuelve la fecha del pedido
     * @return fecha en la que se hizo el pedido
     */
    public LocalDate verFecha(){
        return fechaYhora.toLocalDate();
    }
    /**
     * Devuelve la hora del pedido
     * @return hora en la se hizo el pedido
     */
    public LocalTime verHora() {
        return fechaYhora.toLocalTime();
    }
    /**
     * Asigna la fecha y la hora en la que se hizo el pedido
     * @param fechaYhora fecha y hora
     */
    public void asignarFechaYhora(LocalDateTime fechaYhora) {
        this.fechaYhora = fechaYhora;
    }

    public Cliente verUnCliente() {
        return unCliente;
    }

    public void asignarUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }

//    public Estado verEstado() {
//        return estado;
//    }
//
//    public void asignarEstado(Estado estado) {
//        this.estado = estado;
//    }

    public ArrayList<ProductoDelPedido> getPdp() {
        return pdp;
    }

    public void setPdp(ArrayList<ProductoDelPedido> pdp) {
        this.pdp = pdp;
    }
    
    
    public void mostrar(){
        String patronFecha = "dd/MM/yyyy";
        String patronHora = "HH:mm";
    
        //System.out.println("*** PEDIDO: ");
        System.out.println("Nro: " + this.verNumero());
        System.out.print("Fecha: " + this.verFecha().format(DateTimeFormatter.ofPattern(patronFecha)));
        System.out.println("\tHora: "+this.verHora().format(DateTimeFormatter.ofPattern(patronHora)));
        System.out.println("Cliente: "+this.unCliente.verApellido()+", "+this.unCliente.verNombre());
        System.out.println("Estado: " + this.estado);
        System.out.println("\tPedido\t\tCantidad");
        System.out.println("\t================================");
        System.out.print("\t");
        for(ProductoDelPedido p : pdp){
            System.out.print((p.verUnProducto().verDescripcion())+"\t\t"+(p.verCantidad())+"\n");
            System.out.print("\t");
        }   
    }

    
    
     /**
     * Método hashCode
     * Establece y devuelve el código hash del objeto a partir de su código (código del producto)
     * Código debe ser único para cada objeto del tipo Producto
     * @return hash
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.numero;
        return hash;
    }
    
    /**
     * Método equals
     * Compara dos objetos del tipo Producto a partir de sus códigos
     * @param obj obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pedido other = (Pedido) obj;
        return this.numero == other.numero;
    }
    
}
