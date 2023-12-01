package productos.modelos;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marti
 */
public class GestorProductos {
    private static GestorProductos gestor;
    private ArrayList<Producto> productos = new ArrayList<>();
    //Constantes
    public static final String EXITO = "Producto creado/modificado con éxito";
    public static final String ERROR_CODIGO = "El código del producto es incorrecto";
    public static final String ERROR_DESCRIPCION = "La descripción del producto es incorrecta";
    public static final String ERROR_PRECIO = "El precio del producto es incorrecto";
    public static final String ERROR_CATEGORIA = "La categoría del producto es incorrecta";
    public static final String ERROR_ESTADO = "El precio del producto es incorrecto";
    public static final String PRODUCTOS_DUPLICADOS = "Ya existe un producto con ese código";
    public static final String VALIDACION_EXITO = "Los datos del producto son correctos";
    public static final String PRODUCTO_INEXISTENTE = "No existe el producto especificado";
    public static final String ERROR_PRODUCTO  = "No existe el producto especificado";
    
    /**
     * Constructor
     */
    private GestorProductos() {
    }
    
    //Métodos
    /**
     * Crea una sola instancia de GestorProductos.
     * @return gestor como única instancia
     */
    public static GestorProductos crear(){
        if(gestor == null){
            gestor = new GestorProductos();
        }
        return gestor;
    }
    
    //crea un nuevo producto, devolviendo una cadena con el resultado de la operación.
    public String crearProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado){
        String validar =  control(categoria, codigo, descripcion, estado, precio);
        
        if(validar.equals(this.VALIDACION_EXITO)){
            Producto producto = new Producto(codigo, descripcion, categoria, estado, precio);
            String agrega = agregaproductos(producto);
            return agrega;
        }   
        else{
            return validar + ". " + ERROR_PRODUCTO;
        }
    }
    
    //modifica un producto, devolviendo una cadena con el resultado de la operación.
    public String modificarProducto(Producto productoAModificar, int codigo, String descripcion, float precio, Categoria categoria, Estado estado){
        
    }
        

//○ public ArrayList<Producto> menu(): devuelve todos los productos.
//○ public ArrayList<Producto> buscarProductos(String descripcion):
//busca si existen productos con la descripción especificada (total o
//parcialmente).
//○ public boolean existeEsteProducto(Producto producto): devuelve true
//si existe el producto especificado, false en caso contrario.
//○ public ArrayList<Producto> verProductosPorCategoria(Categoria
//categoria): devuelve los productos con la categoría especificada.
//○ public Producto obtenerProducto(Integer codigo): obtiene el producto
//con el código especificado. Si no hay un producto con el código,
//devuelve null.
//○ Métodos auxiliares que considere necesarios (por ejemplo, los que
//validen los datos de un producto).
    
    
    //Metodos Auxiliares
    
    public String control(Categoria categoria, int codigo, String descripcion, Estado estado, float precio){
        if (categoria == null) {
            return ERROR_CATEGORIA;
        }
        if (codigo <= 0) {
            return ERROR_CODIGO;
        }
        if (descripcion == null || descripcion.isEmpty()) {
            return ERROR_DESCRIPCION;
        }
        if (estado == null) {
            return ERROR_ESTADO;
        }
        if (precio <= 0){
            return ERROR_PRECIO;
        }
        return VALIDACION_EXITO;
    }
    
    public String agregaproductos(Producto producto){
        if(this.productos.contains(producto)){ 
            return this.PRODUCTOS_DUPLICADOS;
        }
        else{
            this.productos.add(producto);
            return this.EXITO;
        }
    }
}
