/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

/**
 *
 * @author Gercray
 */
public class ValidacionUsuario {
    public boolean validarPassword(String password) {
        return password.length() >= 8;
    }
}
