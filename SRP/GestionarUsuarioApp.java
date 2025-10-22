public class GestionarUsuarioApp {
    public static void main(String[] args) {
        String usuario = "noe_saniago";
        String clave = "Santiago123";
        
        // Proceso de registro
        if (RegistroUsuario.registroUsuario(usuario, clave)) {
            System.out.println("Usuario registrado exitosamente.");
        } else {
            System.out.println("Falló el registro de usuario.");
        }
        
        // Proceso de autenticación
        if (AutenticadorUsuario.autenticarUsuario(usuario, clave)) {
            System.out.println("El usuario ha iniciado sesión correctamente.");
        } else {
            System.out.println("Usuario o clave inválido.");
        }
        
        // Pruebas adicionales para validar el funcionamiento
        System.out.println("\n--- Pruebas de validación ---");
        System.out.println("Usuario válido 'test': " + ValidadorUsuario.validarUsuario("test"));
        System.out.println("Usuario válido 'usuario123': " + ValidadorUsuario.validarUsuario("usuario123"));
        System.out.println("Clave válida 'abc': " + ValidadorUsuario.validarClave("abc"));
        System.out.println("Clave válida 'Santiago123': " + ValidadorUsuario.validarClave("Santiago123"));
    }
}