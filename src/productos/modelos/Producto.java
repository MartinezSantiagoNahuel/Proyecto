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
    public String nombre;
    public String estado;
    private int codigo;
    private String descripcion;
    private float precio;
    private String categoria;

    public Producto(int codigo, String descripcion, String categoria, String estado, float precio) {
        this.nombre = nombre;
        this.estado = estado;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
    }
    
    
    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verEstado() {
        return estado;
    }

    public void asignarEstado(String estado) {
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

    public String verCategoria() {
        return categoria;
    }

    public void asignarCategoria(String categoria) {
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
        return "Producto{" + "estado=" + estado + ", codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", categoria=" + categoria + '}';
    }

    
}
