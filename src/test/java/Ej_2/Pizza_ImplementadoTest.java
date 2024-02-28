package Ej_2;

import org.junit.Test;
import static org.junit.Assert.*;

public class Pizza_ImplementadoTest {
    // Creamos una instancia de Pizza_Implementada para utilizarla en nuestras pruebas
    Pizza pizza = new Pizza_Implementado("Hawaiana", 12.99);

    @Test
    public void testGetNombre() {
        // Verificamos que el nombre de la pizza sea el esperado
        assertEquals("Hawaiana", pizza.getNombre());
    }

    @Test
    public void testSetNombre() {
        // Cambiamos el nombre de la pizza
        pizza.setNombre("Margarita");

        // Verificamos que el nombre se haya actualizado correctamente
        assertEquals("Margarita", pizza.getNombre());
    }

    @Test
    public void testGetPrecio() {
        // Verificamos que el precio de la pizza sea el esperado
        assertEquals(12.99, pizza.getPrecio(), 0.01);
    }

    @Test
    public void testSetPrecio() {
        // Cambiamos el precio de la pizza
        pizza.setPrecio(10.99);

        // Verificamos que el precio se haya actualizado correctamente
        assertEquals(10.99, pizza.getPrecio(), 0.01);
    }
}

