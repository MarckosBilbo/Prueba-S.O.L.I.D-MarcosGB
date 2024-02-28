package Ej_2;

// Implementación concreta del autenticador
public class Authenticator_Implementado implements Authenticator {

    private Cliente_Implementado cliente;

    // Constructor que recibe un cliente
    public Authenticator_Implementado(Cliente_Implementado cliente) {
        this.cliente = cliente;
    }

    // Implementación del método de la interfaz
    @Override
    public boolean authenticateUser(String username, String phoneNumber) {
        // Verificar la existencia del cliente
        if (cliente.getNombre().equals(username) && cliente.getTelefono() != null && cliente.getTelefono().equals(phoneNumber)) {
            return true; // Las credenciales son válidas
        } else {
            return false; // Las credenciales son inválidas
        }
    }
}