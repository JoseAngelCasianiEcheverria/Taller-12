/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Biblioteca;

/**
 *
 * @author Gercray
 */
public class Ejericicio1 {

    public static void main(String[] args) {
         Libro libro = new Libro("1984", "George Orwell");
        ReportarLibro reporte = new ReportarLibro();
        PersistenciaLibro persistencia = new PersistenciaLibro();
        
        reporte.generarReporte(libro);
        persistencia.guardarSistema(libro);
    }
}
