package Ej_2;

import static org.junit.Assert.*;
import org.junit.Test;

public class ClienteTest {

    @Test
    public void testCliente() {
        // Crear una instancia de Cliente_Implementado
        Cliente_Implementado cliente = new Cliente_Implementado("John Doe", "123 Main Street", "555-1234");

        // Establecer valores
        cliente.setNombre("John Doe");
        cliente.setDireccion("123 Main Street");
        cliente.setTelefono("555-1234");

        // Verificar los valores establecidos
        assertEquals("John Doe", cliente.getNombre());
        assertEquals("123 Main Street", cliente.getDireccion());
        assertEquals("555-1234", cliente.getTelefono());
    }
}

