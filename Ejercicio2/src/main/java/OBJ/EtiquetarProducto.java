/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBJ;

/**
 *
 * @author Gercray
 */
public class EtiquetarProducto {
    public void generarEtiqueta(Producto producto) {
        System.out.println("Etiqueta del producto:");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecioBase()+ "$");
    }
}
