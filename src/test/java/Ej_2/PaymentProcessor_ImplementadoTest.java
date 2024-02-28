package Ej_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentProcessor_ImplementadoTest {

    @Test
    public void testProcesarPago() {
        // Arrange
        Cliente_Implementado cliente = new Cliente_Implementado("John Doe", "123 Main St", "555-1234");
        Pedido_Implementado pedido = new Pedido_Implementado(cliente);
        pedido.agregarPizza(new Pizza_Implementado("Pizza de pepperoni", 10.0));
        pedido.agregarPizza(new Pizza_Implementado("Pizza de queso", 8.0));
        pedido.calcularPrecioTotal();

        PaymentProcessor_Implementado paymentProcessor = new PaymentProcessor_Implementado(pedido);

        // Act
        paymentProcessor.procesarPago(pedido.getPrecioTotal());

        // Assert
        // No se lanzan excepciones
        assertTrue(true);
    }
}
