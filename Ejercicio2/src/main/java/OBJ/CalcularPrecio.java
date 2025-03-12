/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBJ;

/**
 *
 * @author Gercray
 */
public class CalcularPrecio {
     public double calcularPrecioConImpuesto(Producto producto, double impuesto) {
        return producto.getPrecioBase() * (1 + impuesto);
    }
}
