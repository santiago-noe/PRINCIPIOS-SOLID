public class RegistroUsuario {
    public static boolean registroUsuario(String usuario, String clave) {
        // Validar usuario y clave antes del registro
        if (ValidadorUsuario.validarUsuario(usuario) && 
            ValidadorUsuario.validarClave(clave)) {
            // Lógica de registro (simulada)
            // En un caso real, aquí se guardaría en base de datos
            return true;
        }
        return false;
    }
}