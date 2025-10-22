public class ValidadorUsuario {
    public static boolean validarUsuario(String usuario) {
        // Validar usuario (longitud, caracteres permitidos)
        return usuario != null && 
               usuario.length() >= 5 && 
               usuario.matches("[a-zA-Z_0-9]+");
    }
    
    public static boolean validarClave(String clave) {
        // Validar clave (longitud, complejidad)
        return clave != null && 
               clave.length() >= 8 && 
               clave.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
    }
}