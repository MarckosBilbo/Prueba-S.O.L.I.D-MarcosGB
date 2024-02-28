package Ej_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Authenticator_ImplementadoTest {

    @Test
    public void testAuthenticateUser() {
        // Arrange
        String nombreCliente = "Usuario";
        String telefonoCliente = "123456789";
        Cliente_Implementado cliente = new Cliente_Implementado(nombreCliente, "", telefonoCliente);
        Authenticator_Implementado authenticator = new Authenticator_Implementado(cliente);

        // Act
        boolean autenticado = authenticator.authenticateUser(nombreCliente, telefonoCliente);

        // Assert
        assertTrue(autenticado);
    }
}
