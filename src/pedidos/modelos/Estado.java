/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pedidos.modelos;

/**
 *
 * @author marti
 */
public enum Estado {
    CREADO("creado"), SOLICITADO("solicitado"), PROCESANDO("procesando"), ENTREGRADO("entregado");
    
    private String value;

    private Estado(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value ;
    }
}
