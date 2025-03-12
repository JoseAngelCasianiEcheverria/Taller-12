/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package OBJ;

/**
 *
 * @author Gercray
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1000.00);
        EtiquetarProducto etiqueta = new EtiquetarProducto();
        CalcularPrecio calculadora = new CalcularPrecio();
        
        etiqueta.generarEtiqueta(producto);
        double precioFinal = calculadora.calcularPrecioConImpuesto(producto, 0.15);
        System.out.println("Precio final con impuesto: " + precioFinal + "$");
    }
}
