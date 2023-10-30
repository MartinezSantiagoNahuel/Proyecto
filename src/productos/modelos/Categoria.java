/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author marti
 */
public enum Categoria {
    ENTRADA("Entrada"), PLATOPRINCIPAL("Plato Principal"), POSTRE("Postre");
    
    private String value;

    private Categoria(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}