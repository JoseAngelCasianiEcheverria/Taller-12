
package Login;

public class Ejercicio3 {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Jose", "Cartagena123");
        ValidacionUsuario validador = new ValidacionUsuario();
        ServicioAutenticacion auth = new ServicioAutenticacion();
        
        if (validador.validarPassword(usuario.getPassword())) {
            System.out.println("La contraseña es correcta");
        } else {
            System.out.println("La contraseña es incorrecta");
        }
        
        if (auth.autenticar(usuario, "Cartagena123")) {
            System.out.println("Autenticacion exitosa");
        } else {
            System.out.println("Autenticacion fallida");
        }
    }
}
