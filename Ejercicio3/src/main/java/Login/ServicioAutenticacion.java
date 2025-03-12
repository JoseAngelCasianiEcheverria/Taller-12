/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

/**
 *
 * @author Gercray
 */
public class ServicioAutenticacion {
    public boolean autenticar(Usuario usuario, String password) {
        return usuario.getPassword().equals(password);
    }
}
