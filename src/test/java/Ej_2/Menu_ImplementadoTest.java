package Ej_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Menu_ImplementadoTest {

    @Test
    public void testObtenerListaPizzas() {
        // Crea una instancia del menú implementado
        Menu menu = new Menu_Implementado();

        // Verifica que la lista de pizzas no sea nula
        assertNotNull(menu.obtenerPizzasDisponibles());

        // Verifica que la lista de pizzas contenga elementos
        assertEquals(5, menu.obtenerPizzasDisponibles().size()); // Ajusta el valor esperado según tu implementación
    }

    @Test
    public void testObtenerPrecioPizza() {
        // Crea una instancia del menú implementado
        Menu menu = new Menu_Implementado();

        // Verifica el precio de una pizza específica
        assertEquals(9.99, menu.getPrecioPizza("Jamón y queso")); // Ajusta el valor esperado según tu implementación
    }
}

