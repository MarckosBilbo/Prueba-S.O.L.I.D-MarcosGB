package Ej_2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class Pedido_ImplementadoTest {
    private Pedido_Implementado pedido;
    private Cliente_Implementado cliente;

    @Before
    public void setUp() {
        cliente = new Cliente_Implementado("Juan", "Perez", "Calle Falsa 123");
        pedido = new Pedido_Implementado(cliente);
    }

    @Test
    public void testAgregarPizza() {
        Pizza pizza1 = new Pizza_Implementado("Margherita", 10.99);
        Pizza pizza2 = new Pizza_Implementado("Pepperoni", 12.99);

        pedido.agregarPizza(pizza1);
        pedido.agregarPizza(pizza2);

        List<Pizza> pizzas = pedido.getPizzas();
        assertNotNull(pizzas);
        assertEquals(2, pizzas.size());
        assertTrue(pizzas.contains(pizza1));
        assertTrue(pizzas.contains(pizza2));
    }

    @Test
    public void testCalcularPrecioTotal() {
        Pizza pizza1 = new Pizza_Implementado("Margherita", 10.99);
        Pizza pizza2 = new Pizza_Implementado("Pepperoni", 12.99);

        pedido.agregarPizza(pizza1);
        pedido.agregarPizza(pizza2);

        pedido.calcularPrecioTotal();

        assertEquals(23.98, pedido.getPrecioTotal(), 0.001);
    }
}
