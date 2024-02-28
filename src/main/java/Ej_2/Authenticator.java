package Ej_2;

// Interfaz para la autenticación de usuarios
public interface Authenticator {
    // Método para autenticar usuarios
    boolean authenticateUser(String username, String password);
    // Otros métodos relevantes
}