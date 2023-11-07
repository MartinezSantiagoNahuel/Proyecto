/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author marti
 */
public class Producto {
    private Estado estado;
    private int codigo;
    private String descripcion;
    private float precio;
    private Categoria categoria;

    public Producto(int codigo, String descripcion, Categoria categoria, Estado estado, float precio) {
        this.estado = estado;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
    }

    public Estado verEstado() {
        return estado;
    }

    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }

    public int verCodigo() {
        return codigo;
    }

    public void asignarCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float verPrecio() {
        return precio;
    }

    public void asignarPrecio(float precio) {
        this.precio = precio;
    }

    public Categoria verCategoria() {
        return categoria;
    }

    public void asignarCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public void mostrar(){
        System.out.println("   Producto:   ");
        System.out.println("Estado: " + this.verEstado());
        System.out.println("Descripcion: " + this.verDescripcion());
        System.out.println("Codigo: " + this.verCodigo());
        System.out.println("Categoria: " + this.verCategoria());
        System.out.println("Precio: $" + this.verPrecio());
    }

    @Override
    public String toString() {
        return descripcion;
    }
        
        
}
