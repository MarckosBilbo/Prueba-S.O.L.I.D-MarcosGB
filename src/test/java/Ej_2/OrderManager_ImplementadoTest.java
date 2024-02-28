package Ej_2;

import org.junit.jupiter.api.Test;

public class OrderManager_ImplementadoTest {

    @Test
    public void testOrderManagerMethods() {
        // Arrange
        Cliente_Implementado cliente = new Cliente_Implementado("Usuario", "", "123456789");
        Pedido_Implementado pedido = new Pedido_Implementado(cliente);
        DataBaseManager_Implementado dataBaseManager = new DataBaseManager_Implementado();
        Authenticator authenticator = new Authenticator_Implementado(cliente);
        OrderManager_Implementado orderManager = new OrderManager_Implementado(dataBaseManager, authenticator);

        // Act
        orderManager.createOrder(pedido);
        orderManager.checkOrder();
        orderManager.deleteOrder();

        // No es necesario Assert, si los métodos se ejecutan sin lanzar excepciones, el test se considera exitoso
    }
}

